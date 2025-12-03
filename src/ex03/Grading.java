package ex03;

import java.util.Scanner;

public class Grading {

    public static void main(String[] args) {
        int grade = 50;

        if (grade >= 90) {
            int num = 500;
            System.out.println("학점 A");
        } else if (grade >= 80) {
            System.out.println("학점 B");
        } else if (grade >= 70) {
            System.out.println("학점 C");
        } else if (grade >= 60) {
            System.out.println("학점 D");
        } else {
            System.out.println("학점 F");
        }

    }
}
