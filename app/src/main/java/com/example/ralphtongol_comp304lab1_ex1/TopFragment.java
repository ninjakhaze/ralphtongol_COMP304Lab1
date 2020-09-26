package com.example.ralphtongol_comp304lab1_ex1;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TopFragment extends Fragment implements AdapterView.OnItemClickListener {


    ListView lv;
    ArrayList<String> al;
    ArrayAdapter<String> aa;

    public TopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String[] Activity = {"AIActivity", "VRActivity"};

        ListView listView = (ListView) view.findViewById(R.id.lst);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, Activity);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position==0)
        {
            Intent intent = new Intent(getActivity(), NewActivity.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "onCreate Executed", Toast.LENGTH_SHORT).show();
            Toast.makeText(getActivity(), "onStart Executed", Toast.LENGTH_SHORT).show();
        }
        else if(position==1)
        {
            Intent intent = new Intent(getActivity(), NewActivity2.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "onCreate Executed", Toast.LENGTH_SHORT).show();
            Toast.makeText(getActivity(), "onStart Executed", Toast.LENGTH_SHORT).show();
        }
    }
}