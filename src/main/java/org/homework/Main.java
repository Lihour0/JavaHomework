package org.homework;


public class Main {
    private final static int DEBUG = 2;

    public static void main(String[] args) {

        if (DEBUG == 1) {
            Homework1 test = new Homework1();
            test.input();
            test.output();
        }
        if (DEBUG == 2) {
            Homework2 test = new Homework2();

            test.input();
            test.print();
        }
    }
}