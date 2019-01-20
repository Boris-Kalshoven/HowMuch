package com.example.howmuch;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentResult extends Fragment {

    View view;
    private RecyclerView myrecyclerview;
    private List<Result> listResult;

    //aog = amount of grams
    //aoj = amount of joints
    private double aog2 = 2;
    private double aoj2 = 6;
    private double aog3 = 3;
    private double aoj3 = 9;
    private double aog4 = 4;
    private double aoj4 = 12;
    private double aog5 = 5.2;
    private double aoj5 = 15;
    private double aog6 = 6;
    private double aoj6 = 18;
    private double aog7 = 7;
    private double aoj7 = 21;


    public FragmentResult() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.result_fragment, container, false);
        myrecyclerview = view.findViewById(R.id.result_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), listResult);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listResult = new ArrayList<>();
        listResult.add(new Result(aog2, aoj2, R.drawable.result_img));
        listResult.add(new Result(aog3, aoj3, R.drawable.result_img));
        listResult.add(new Result(aog6, aoj6, R.drawable.result_img));
        listResult.add(new Result(aog4, aoj4, R.drawable.result_img));
        listResult.add(new Result(aog7, aoj7, R.drawable.result_img));
        listResult.add(new Result(aog5, aoj5, R.drawable.result_img));


    }

}
