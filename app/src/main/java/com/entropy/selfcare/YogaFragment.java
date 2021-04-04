package com.entropy.selfcare;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link YogaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class YogaFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public YogaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment YogaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static YogaFragment newInstance(String param1, String param2) {
        YogaFragment fragment = new YogaFragment();
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
        return inflater.inflate(R.layout.fragment_yoga, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ListView listView = view.findViewById(R.id.listView);

        //create data
        ArrayList<Person> arrayList =  new ArrayList<>();

        arrayList.add(new Person(R.drawable.yoga11, "Sunrise Pose", "Beginners Pose"));
        arrayList.add(new Person(R.drawable.yoga2, "Downward Dog Pose", "Beginners Pose"));
        arrayList.add(new Person(R.drawable.yoga3, "Wheel Pose", "Beginners Pose"));
        arrayList.add(new Person(R.drawable.yoga4, "Boat Pose", "Beginners Pose"));
        arrayList.add(new Person(R.drawable.yoga5, "Warrior Pose", "Intermediate Pose"));
        arrayList.add(new Person(R.drawable.yoga6, "Cobra Pose", "Intermediate Pose"));
        arrayList.add(new Person(R.drawable.yoga7, "Crossbow Pose", "Intermediate Pose"));
        arrayList.add(new Person(R.drawable.yoga8, "Stone Pose", "Intermediate Pose"));

        PersonAdapter personAdapter = new PersonAdapter(getActivity(),R.layout.list_row,arrayList);

        listView.setAdapter(personAdapter);
        listView.setOnItemClickListener((adapterView, v, i, l) -> {
            switch(i)
            {
                case 0: startActivity(new Intent(getActivity(),Yoga1.class));
                    break;
                case 1: startActivity(new Intent(getActivity(),Yoga2.class));
                    break;
                case 2: startActivity(new Intent(getActivity(),Yoga3.class));
                    break;
                case 3: startActivity(new Intent(getActivity(),Yoga4.class));
                    break;
                case 4: startActivity(new Intent(getActivity(),Yoga5.class));
                    break;
                default:
                    break;
            }
        });
    }
}