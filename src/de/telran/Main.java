package de.telran;

public class Main {

    public static void main(String[] args) {
        System.out.println("Total Eated : = " + bigCake(1));
    }

    static double bigCake(double x) {
        double masha = x / 2;
        double petea = masha / 2;
        double vasea = (petea + masha) * 4;
        double sumCake = vasea + petea + masha;
        return sumCake;
    }
}

