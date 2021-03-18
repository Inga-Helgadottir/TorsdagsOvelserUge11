package com.company;

public class DoView {
    double result;
    String typeOfResult;

    public DoView(double result, String typeOfResult) {
        this.result = result;
        this.typeOfResult = typeOfResult;
    }

    public static void doView(double result, String typeOfResult){
        System.out.printf("Du betaler %.2f%3s i %s%n",result,Main.CURRENCY,Main.MSG);
    }
}
