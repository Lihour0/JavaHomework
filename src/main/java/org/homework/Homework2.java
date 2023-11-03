package org.homework;

import java.util.Scanner;

public class Homework2 {
    private enum carType {
        C,
        B,
        T

    }

    private carType car;
    private double timeParked;


    public double parkingCharge() {
        return switch (car) {
            case C:
                yield (timeParked * 2);
            case B:
                yield (timeParked * 3.5);
            case T:
                yield (timeParked * 5);
        };
    }

    ;

    public carType parseCarType(String input) {
        while (true) {
            switch (input) {
                case "C":
                    return carType.C;
                case "B":
                    return carType.B;
                case "T":
                    return carType.T;
                default:
                    System.out.println("Invalid Input");
                    System.out.print("Enter Type of Car (C, B, T):");

            }
            input = new Scanner(System.in).next();
        }
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Type of Car (C, B, T):");
        car = parseCarType(input.next());
        System.out.print("Enter Hour spent parking:");
        timeParked = input.nextDouble();
    }

    public void print() {
        System.out.println("Total Parking Charge:" + parkingCharge());
    }
}
