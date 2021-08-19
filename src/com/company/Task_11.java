package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task_11 {
    //    5. Вычислить значение функции:

    public static void main(String[] args) {

        Scanner str = new Scanner(in);

        out.println("enter x");
        double x = str.nextDouble();
        double f;


        if (x <= 3) {
            f = x * x - 3 * x + 9;
            out.println("f=" + f);

        } else {
            f = 1 / (Math.pow(x, 3) + 6);
            out.println("f=" + f);

        }
        out.println("f=" +f);


    }
}

