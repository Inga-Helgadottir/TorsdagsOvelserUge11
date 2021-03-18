package com.company;

public class DoVat {
    double number;
    final static int PRCVAT = 25;
    public DoVat(double number) {
        this.number = number;
    }

    public static double doVAT(double number){
        double VAT = number / 100 * PRCVAT;
        return VAT;
    }
}
