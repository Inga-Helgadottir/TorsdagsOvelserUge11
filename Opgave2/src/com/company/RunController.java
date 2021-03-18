package com.company;

public class RunController {
    public RunController() {
    }

    public static void runController() {
        double userIn = Dialog.doDiag();
        double moms = DoVat.doVAT(userIn);
        DoView.doView(moms,Main.MSG);
    }
}
