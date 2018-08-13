package com.pack.one;

public class MainClass {

    public static void main (String args[]) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add2Num(3,4));
        System.out.println(calculator.multiply2Num(3,4));
        System.out.println(calculator.divide2Num(30,4));
    }

}
