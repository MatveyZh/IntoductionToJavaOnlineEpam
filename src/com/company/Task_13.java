package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task_13 {


    //2. Вычислить значения функции на отрезке [а,b] c шагом h:
    public static void main(String[] args) {

        Scanner str = new Scanner(in);

        out.println("enter a");
        double a = str.nextDouble();
        out.println("enter b");
        double b = str.nextDouble();
        out.println("enter h");
        double h = str.nextDouble();

        double f;

        for (double x = a; x < b; x += h) {

            if (x > 2) {
                f = x;
            } else {
                f = -x;
            }


            String answer = String.format("f(%s)=%s", x, f);
            out.println(answer);


        }
    }
}
