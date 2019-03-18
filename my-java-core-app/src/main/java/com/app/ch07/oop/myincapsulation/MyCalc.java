package com.app.ch07.oop.myincapsulation;

public class MyCalc {

    public float add(float a, float b) {
        return calculatorEngine(a, b, CalcActionType.PLUS);
    }

    public float subtract(float a, float b) {
        return calculatorEngine(a, b, CalcActionType.MINUS);
    }

    public float devide(float a, float b) {
        return calculatorEngine(a, b, CalcActionType.DEVIDE);
    }

    public float multiply(float a, float b) {
        return calculatorEngine(a, b, CalcActionType.MULTIPPLY);
    }


    private float calculatorEngine(float a, float b, CalcActionType calcActionType) {
        switch (calcActionType) {
            case PLUS:
                return a + b;
            case MINUS:
                return a - b;
            case DEVIDE:
                return a / b;
            case MULTIPPLY:
                return a * b;
            default:
                throw new RuntimeException("Incorrect type");
        }
    }
}
