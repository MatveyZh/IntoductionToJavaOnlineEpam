package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task_7 {
    public static void main(String[] args) {
//        1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//        он прямоугольным.
        Scanner str = new Scanner(in);
        out.println("enter the first corner");
        int x = str.nextInt();
        out.println("enter the second corner");
        int y = str.nextInt();
        if (x+y<180&&x>0&&y>0)
        {
            out.println("this triangle exist");
            if (x+y==90)
            {
                out.println("and it has 90 degrees angle");
            }

        }
        else  out.println("this triangle does not exist");

    }

    }
