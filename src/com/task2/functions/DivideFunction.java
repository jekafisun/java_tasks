package com.task2.functions;

import com.task2.interfaces.Printable;

public class DivideFunction extends MathFunction implements Printable {
    private double result;

    @Override
    public void doCalculation(int a, int b) {
        result = (float) a / b;
    }
    @Override
    public void printResult() {
        System.out.println(result);
    }
}
