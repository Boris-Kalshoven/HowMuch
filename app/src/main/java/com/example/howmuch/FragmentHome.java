package com.example.howmuch;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.parseDouble;
import static java.lang.Double.valueOf;

public class FragmentHome extends Fragment {
    private final double normalAmount = 0.3;
    Context context;
    View view;
    private EditText amountEditText;

    private List<Result> listResult;

    public FragmentHome() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.home_fragment, container, false);

        context = container.getContext();

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE | WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        listResult = new ArrayList<>();

        amountEditText = view.findViewById(R.id.editText);

        Button calcBtn = view.findViewById(R.id.calcBtn);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amountOfGrams = amountEditText.getText().toString();

                if (!(TextUtils.isEmpty(amountOfGrams))) {
                    double resultAmount = Math.floor(Double.parseDouble(amountOfGrams) / normalAmount);
                    Result newResult = new Result(Double.parseDouble(amountOfGrams), resultAmount, R.drawable.homepage_image_weed);

                    listResult.add(newResult);
                    Snackbar.make(view, newResult.toString(), Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                } else {
                    Snackbar.make(view, "Vul alstublieft een hoeveelheid gram in", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            }
        });
        return view;
    }

}
