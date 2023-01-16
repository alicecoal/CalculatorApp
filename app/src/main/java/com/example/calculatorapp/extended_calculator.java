package com.example.calculatorapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class extended_calculator extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view1 = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_extended_calculator, container, false);

        Button sinBTN = (Button) view1.findViewById(R.id.sinBTN);
        Button cosBTN = (Button) view1.findViewById(R.id.cosBTN);
        Button tanBTN = (Button) view1.findViewById(R.id.tanBTN);
        Button arcsinBTN = (Button) view1.findViewById(R.id.arcsinBTN);
        Button arccosBTN = (Button) view1.findViewById(R.id.arccosBTN);
        Button arctanBTN = (Button) view1.findViewById(R.id.arctanBTN);
        Button lnBTN = (Button) view1.findViewById(R.id.lnBTN);
        Button lgBTN = (Button) view1.findViewById(R.id.lgBTN);
        Button squareRootBTN = (Button) view1.findViewById(R.id.squareRootBTN);
        Button absolutValueBTN = (Button) view1.findViewById(R.id.absolutValueBTN);
        Button xSquaredBTN = (Button) view1.findViewById(R.id.xSquaredBTN);
        Button xPowerYBTN = (Button) view1.findViewById(R.id.xPowerYBTN);
        Button radBTN = (Button) view1.findViewById(R.id.radBTN);
        Button piBTN = (Button) view1.findViewById(R.id.piBTN);
        Button eBTN = (Button) view1.findViewById(R.id.eBTN);


        sinBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("sin(");
        });

        cosBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("cos(");
        });

        tanBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("tan(");
        });

        arcsinBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("arcsin(");
        });

        arccosBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("arccos(");
        });

        arctanBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("arctan(");
        });

        lnBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("ln(");
        });

        lgBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("lg(");
        });

        squareRootBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("sqrt(");
        });

        absolutValueBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("abs(");
        });

        xSquaredBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("^(2)");
        });

        xPowerYBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("^(");
        });

        radBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("rad(");
        });

        piBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("pi");
        });

        eBTN.setOnClickListener(v -> {
            ((MainActivity) getActivity()).updateText("e");
        });

        return view1;

    }
}