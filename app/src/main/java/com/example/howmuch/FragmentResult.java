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
        listResult.add(new Result(2, 6, R.drawable.result_img));
        listResult.add(new Result(3, 9, R.drawable.result_img));
        listResult.add(new Result(4, 12, R.drawable.result_img));
        listResult.add(new Result(5, 15, R.drawable.result_img));
        listResult.add(new Result(6, 18, R.drawable.result_img));


    }

}
