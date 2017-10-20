package com.example.andy.usingframents;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ANDY on 9/23/2017.
 */
public class usingFragmentsList extends ListFragment implements AdapterView.OnItemClickListener {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup view =inflater.inflate(R.layout.list_fragment, container, false);

        return view;
}

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter myadapter= ArrayAdapter.createFromResource(getActivity(), R.array.CentralMarket, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> parent,View view, int position,long id){
        Toast.makeText(getActivity(), "Please select according to your choice:" + position, Toast.LENGTH_LONG).show();

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if(position==0){

            TextView label=(TextView)getActivity().findViewById(R.id.activity_main_fragment);
            Toast.makeText(getActivity(), "Please tap and select the fruit to buy:" +position, Toast.LENGTH_LONG).show();
            ImageView orange=(ImageView) findViewById(R.id.orange);
            orange.setImageResource(R.drawable.orange1);
        }

        else if(position==1){

            TextView label=(TextView)getActivity().findViewById(R.id.activity_main_fragment);
            Toast.makeText(getActivity(), "Please tap and select the Vegetable to buy:" +position, Toast.LENGTH_LONG).show();
        }
        if(position==2){

            TextView label=(TextView)getActivity().findViewById(R.id.activity_main_fragment);
            Toast.makeText(getActivity(), "We have favorite meat for you, please make your favourite choice:" +position, Toast.LENGTH_LONG).show();
        }
        if(position==3){

            TextView label=(TextView)getActivity().findViewById(R.id.activity_main_fragment);
            Toast.makeText(getActivity(), "Please select according to your choice:" +position, Toast.LENGTH_LONG).show();
        }
        if(position==4){

            TextView label=(TextView)getActivity().findViewById(R.id.activity_main_fragment);
            Toast.makeText(getActivity(), "Tap to select your best shoe:" +position, Toast.LENGTH_LONG).show();
        }
    }
}


