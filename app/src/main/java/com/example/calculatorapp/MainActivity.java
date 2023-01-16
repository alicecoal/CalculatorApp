package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import org.mariuszgromada.math.mxparser.*;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.app.Fragment;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText display;
    private TextView previousCalculation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simple_calculator firstFragment = new simple_calculator();
        extended_calculator secondFragment = new extended_calculator();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame_layout, firstFragment);
        if (getScreenOrientation()) ft.replace(R.id.frame_layout1, secondFragment);
        ft.addToBackStack(null);
        ft.commit();

        previousCalculation = findViewById(R.id.previousCalculationView);
        display = findViewById(R.id.displayEditText);
        display.setShowSoftInputOnFocus(false);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if (getString(R.string.display).equals(display.getText().toString())){
                  display.setText("");
              }
            }
        });
    }

    private boolean getScreenOrientation(){
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) return true;
        else return false;
    }


    public void updateText(String strToAdd){
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        if (getString(R.string.display).equals(display.getText().toString())) {
            display.setText(strToAdd);
            display.setSelection(cursorPos + strToAdd.length());
        }
        else {
            display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
            display.setSelection(cursorPos + strToAdd.length());
        }
    }

    public void setDisplay(String str){
        display.setText(str);
    }

    public void setPrevCalc(String str) {
        previousCalculation.setText(str);
    }

    public void equals(){
        String userExp  = display.getText().toString();
        previousCalculation.setText(userExp);
        userExp = userExp.replaceAll("÷", "/");
        userExp = userExp.replaceAll("×", "*");
        Expression exp = new Expression(userExp);
        String pattern ="#.#####";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String result = decimalFormat.format(exp.calculate()).replaceAll(",", ".");
        display.setText(result);
        display.setSelection(result.length());
    }

    public void backspace(){
        int cursorPos = display.getSelectionStart();
        int textLen = display.getText().length();
        if (cursorPos != 0 && textLen != 0){
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursorPos - 1, cursorPos, "");
            display.setText(selection);
            display.setSelection(cursorPos - 1);
        }
    }

}