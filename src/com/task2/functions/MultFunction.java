package com.task2.functions;

import com.task2.interfaces.Printable;

public class MultFunction extends MathFunction implements Printable {
    private int result;

    @Override
    public void doCalculation(int a, int b) {
        result = a * b;
    }

    @Override
    public void printResult() {
        System.out.println(result);
    }
}
