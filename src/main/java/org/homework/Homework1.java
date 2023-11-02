package org.homework;

import java.util.Scanner;

public class Homework1 {
    private double score;

    public void print(String test) {
        System.out.print(test);
    }

    private void checkScore() {
        if ((this.score <= 25)) {
            print("Very Bad");
        } else {
            if ((this.score <= 30)) {
                print("Bad");
            } else {
                if ((this.score <= 60)) {
                    print("Fair");
                } else {
                    if ((this.score <= 80)) {
                        print("Very Fair");
                    } else {
                        if ((this.score <= 100)) {
                            print("Smart");
                        } else {
                            print("Invalid Score");
                        }
                    }
                }
            }
        }
    }

    void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Type Score:");
        score = input.nextDouble();
    }

    void output() {
        System.out.println(score);
        checkScore();
    }

}