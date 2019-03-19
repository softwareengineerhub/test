package com.app.ch11.myabstract;

import java.io.IOException;

public class CalculatorMyAction extends MyAction {

    @Override
    public void doAction() {
        try {
            Runtime.getRuntime().exec("calc.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
