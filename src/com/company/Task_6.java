package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task_6 {
    public static void main(String[] args) {
//        6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//        принадлежит закрашенной области, и false — в противном случае:

        Scanner scanner = new Scanner(in);
        out.println("enter x");
        int x = scanner.nextInt();
        out.println("enter y");
        int y = scanner.nextInt();

        if ((-2 <= x && x <= 2 && 0 <= y && y <= 4) || (-4 <= x && x <= 4 && -3 <= y && y <= 0)) {
            out.println(true);
        } else out.println(false);
        scanner.close();
    }
}
