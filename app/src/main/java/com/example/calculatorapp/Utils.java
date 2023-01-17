package com.example.calculatorapp;

import org.mariuszgromada.math.mxparser.Expression;

import java.text.DecimalFormat;

public class Utils {

        public static String solveExpression(String userExp){
            Expression exp = new Expression(userExp);
            String pattern ="#.#####";
            DecimalFormat decimalFormat = new DecimalFormat(pattern);
            String result = decimalFormat.format(exp.calculate()).replaceAll(",", ".");
            return result;
        }

}
