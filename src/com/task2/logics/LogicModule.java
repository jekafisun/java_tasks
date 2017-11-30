package com.task2.logics;

import com.task2.functions.DifferenceFunction;
import com.task2.functions.DivideFunction;
import com.task2.functions.MultFunction;
import com.task2.functions.SumFunction;

import java.util.Scanner;

public class LogicModule {
    private int a, b;
    private char operationSymbol;
    public void initApp() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = scan.nextInt();
        System.out.println("Enter second number: ");
        b = scan.nextInt();
        System.out.println("Enter one of this symbol for operation: \"+\", \"-\", \"*\", \"/\"");
        operationSymbol = scan.next().charAt(0);
    }
    public void startApp() {
        if (operationSymbol == '+') {
            SumFunction sum = new SumFunction();
            sum.doCalculation(a, b);
            sum.printResult();
        } else if (operationSymbol == '-') {
            DifferenceFunction dif = new DifferenceFunction();
            dif.doCalculation(a, b);
            dif.printResult();
        } else if (operationSymbol == '*') {
            MultFunction mult = new MultFunction();
            mult.doCalculation(a, b);
            mult.printResult();
        } else if (operationSymbol == '/') {
            DivideFunction div = new DivideFunction();
            div.doCalculation(a, b);
            div.printResult();
        } else {
            System.out.println("Entered not correct symbol!");
        }
    }
}
