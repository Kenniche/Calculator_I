package com.kenniche.calculator;

public class Program {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        myCalculator.setNum1(10.5);
        myCalculator.setNum2(5.2);
        myCalculator.setOperator('+');
        myCalculator.performOperation();
        myCalculator.getResults();
        
        myCalculator.setNum1(26.2);
        myCalculator.setNum2(10.5);
        myCalculator.setOperator('-');
        myCalculator.performOperation();
        myCalculator.getResults();
    }
}
