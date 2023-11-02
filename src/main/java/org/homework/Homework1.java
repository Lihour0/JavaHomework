package org.homework;

import java.util.Scanner;

public class Homework1 {
    private double score;

    void input() {
        Scanner input = new Scanner(System.in);
        score = input.nextDouble();
    }

    void output() {
        System.out.println(score);
    }


}