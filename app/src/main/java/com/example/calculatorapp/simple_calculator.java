package com.example.calculatorapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.mariuszgromada.math.mxparser.Expression;

public class simple_calculator extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_simple_calculator, container, false);

        Button zeroBTN = (Button) view.findViewById(R.id.zeroBTN);
        Button oneBTN = (Button) view.findViewById(R.id.oneBTN);
        Button twoBTN = (Button) view.findViewById(R.id.twoBTN);
        Button threeBTN = (Button) view.findViewById(R.id.threeBTN);
        Button fourBTN = (Button) view.findViewById(R.id.fourBTN);
        Button fiveBTN = (Button) view.findViewById(R.id.fiveBTN);
        Button sixBTN = (Button) view.findViewById(R.id.sixBTN);
        Button sevenBTN = (Button) view.findViewById(R.id.sevenBTN);
        Button eightBTN = (Button) view.findViewById(R.id.eightBTN);
        Button nineBTN = (Button) view.findViewById(R.id.nineBTN);
        Button clearBTN = (Button) view.findViewById(R.id.clearBTN);
        Button pointBTN = (Button) view.findViewById(R.id.pointBTN);
        Button addBTN = (Button) view.findViewById(R.id.addBTN);
        Button multiplyBTN = (Button) view.findViewById(R.id.multiplyBTN);
        Button divideBTN = (Button) view.findViewById(R.id.divideBTN);
        Button subtractBTN = (Button) view.findViewById(R.id.subtractBTN);
        Button parOpenBTN = (Button) view.findViewById(R.id.parOpenBTN);
        Button parCloseBTN = (Button) view.findViewById(R.id.parCloseBTN);
        Button equalsBTN = (Button) view.findViewById(R.id.equalsBTN);
        Button backspaceBTN = (Button) view.findViewById(R.id.backspaceBTN);


        zeroBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("0");
        });

        oneBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("1");
        });

        twoBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("2");
        });

        threeBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("3");
        });

        fourBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("4");
        });

        fiveBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("5");
        });

        sixBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("6");
        });

        sevenBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("7");
        });

        eightBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("8");
        });

        nineBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("9");
        });

        clearBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).setDisplay("");
            ((MainActivity) getActivity()).setPrevCalc("");
        });

        pointBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText(".");
        });

        addBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("+");
        });

        subtractBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("-");
        });

        multiplyBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("×");
        });

        divideBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("÷");
        });

        parOpenBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("(");
        });

        parCloseBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText(")");
        });

        equalsBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).equals();
        });

        backspaceBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).backspace();
        });

        return view;

    }

}