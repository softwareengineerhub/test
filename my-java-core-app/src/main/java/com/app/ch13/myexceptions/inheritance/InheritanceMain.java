package com.app.ch13.myexceptions.inheritance;

import java.sql.SQLException;

public class InheritanceMain {

    public static void main(String[] args) {
        AType type = getType(1);
        try {
            type.m();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        BType bType = new BType();
        //bType.m();
    }


    private static AType getType(int type) {
        switch (type) {
            case 0:
                return new AType();
            case 1:
                return new BType();
            default:
                throw new RuntimeException("Incorrect type: " + type);
        }
    }
}
