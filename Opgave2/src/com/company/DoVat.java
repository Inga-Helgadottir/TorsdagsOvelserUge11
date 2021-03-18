package com.company;

public class DoVat {
    double number;
    public DoVat(double number) {
        this.number = number;
    }

    public static double doVAT(double number){
        double VAT = number / 100 * Main.PRCVAT;
        return VAT;
    }
}
