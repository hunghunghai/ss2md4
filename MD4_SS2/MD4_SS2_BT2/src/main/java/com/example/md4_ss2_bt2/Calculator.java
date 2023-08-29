package com.example.md4_ss2_bt2;


public class Calculator {
    public static double calculator(double first, double second, String value) {
        switch (value) {
            case "1":
                return first + second;
            case "2":
                return first - second;
            case "3":
                return first * second;
            case "4":

                if (second != 0) {
                    return first / second;
                } else {
                    throw new RuntimeException("Không chia được cho 0");
                }
            default:
                throw new RuntimeException();
        }

    }
}
