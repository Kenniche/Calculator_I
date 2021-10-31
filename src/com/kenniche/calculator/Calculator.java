package com.kenniche.calculator;

public class Calculator {
	private double results;
	private double num1;
	private double num2;
	private char operator; 
	
	public Calculator() {
		
	}
	public void setNum1(double input) {
		this.num1 = input;
	}
	public void setNum2(double input) {
		this.num2 = input;
	}
	public void setOperator(char input) {
		this.operator = input;
	}
	public void performOperation() {
		if( this.operator == '+') {
			results = (num1) + (num2);
		}
		if( this.operator == '-') {
			results = (num1) - (num2);
		}
	}
	
	public double getNum1() {
		return num1;
	}

	public double getNum2() {
		return num2;
	}

	public char getOperator() {
		return operator;
	}

	public void setResults(double results) {
		this.results = results;
	}

	public void getResults() {
		System.out.print(getNum1() + " " + getOperator() + " " + getNum2() +" = ");
		System.out.println(results);
	}

}
