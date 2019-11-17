package com.doct0rx.sparrow.ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.doct0rx.sparrow.R;
import com.doct0rx.sparrow.ui.fragments.maps.MapsActivity;

public class MakeYourWayFragment extends Fragment {

    private View view;
    private Button travelFasterButton;
    private Button travelGreenerButton;
    private Button travelAroundButton;
    private Button visitWonderlandButton;

    public MakeYourWayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_make_your_way, container, false);
        travelFasterButton = view.findViewById(R.id.travelFasterButton);
        travelFasterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startMapActivity = new Intent(getActivity(), MapsActivity.class);
                startActivity(startMapActivity);
            }
        });

        travelGreenerButton = view.findViewById(R.id.travelGreenerButton);
        travelGreenerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startMapActivity = new Intent(getActivity(), MapsActivity.class);
                startActivity(startMapActivity);
            }
        });

        travelAroundButton = view.findViewById(R.id.travelAroundButton);
        travelAroundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startMapActivity = new Intent(getActivity(), MapsActivity.class);
                startActivity(startMapActivity);
            }
        });

        visitWonderlandButton = view.findViewById(R.id.visitAWonderlandButton);
        visitWonderlandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startMapActivity = new Intent(getActivity(), MapsActivity.class);
                startActivity(startMapActivity);
            }
        });
        
        return view;
    }
}
