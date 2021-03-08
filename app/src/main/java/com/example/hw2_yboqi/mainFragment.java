package com.example.hw2_yboqi;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link mainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class mainFragment extends Fragment implements View.OnClickListener {

    private Button button;
    private Button start;
    private Button lap;
    private Button reset;
    public TextView timetext;
    private OnFragmentInteractionListener mListener;

    public mainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        button = (Button) view.findViewById(R.id.nextb);
        start = (Button) view.findViewById(R.id.startb);
        lap = (Button) view.findViewById(R.id.lapb);
        reset = (Button) view.findViewById(R.id.resetb);
        timetext = (TextView) view.findViewById(R.id.time);

        button.setOnClickListener(this);
        start.setOnClickListener(this);
        lap.setOnClickListener(this);
        reset.setOnClickListener(this);


        return view;

    }



    @Override
    public void onClick(View v) {
        if(v.getId() == button.getId()){

            mListener.onButtonClicked(0);

        }else if (v.getId() == start.getId()){


            mListener.onButtonClicked(1);

        } else if(v.getId() == lap.getId() ){

            mListener.onButtonClicked(2);
        }else if(v.getId() == lap.getId() ){

            mListener.onButtonClicked(3);
        }
    }



    public interface OnFragmentInteractionListener{
        void onButtonClicked(int infoID);
    }
}