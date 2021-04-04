package com.entropy.selfcare;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MeditationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MeditationFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MeditationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MeditationFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MeditationFragment newInstance(String param1, String param2) {
        MeditationFragment fragment = new MeditationFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_meditation, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button mbutton1 = null;
        Button mbutton2 = null;
        Button mbutton3 = null;
        Button mbutton4 = null;
        setContentView(R.layout.fragment_meditation);

            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_meditation);
            mbutton1 = mbutton1.findViewById(R.id.button1);
            mbutton2 = mbutton1.findViewById(R.id.button2);
            mbutton3 = mbutton1.findViewById(R.id.button3);
            mbutton4 = mbutton1.findViewById(R.id.button4);
            mbutton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    startActivity(new Intent(getActivity(), medforstress.class));
                }
            });
            mbutton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    startActivity(new Intent(getActivity(), medforsleep.class));
                }
            });
            mbutton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    startActivity(new Intent(getActivity(), medforsleep.class));
                }
            });

    }

    private void setContentView(int fragment_meditation) {
    }
}