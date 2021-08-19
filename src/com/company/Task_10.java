package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task_10 {
//    4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//    отверстие.


    public static void main(String[] args) {
        Scanner str = new Scanner(in);
        out.println("Enter a side of hole A:");
        int a = str.nextInt();
        out.println("Enter a side of hole B:");
        int b = str.nextInt();

        out.println("Enter a sides of brick");
        out.println("enter x");
        int x = str.nextInt();
        out.println("enter y");
        int y = str.nextInt();
        out.println("enter z");
        int z = str.nextInt();


       if ((z<=a&&x<=b||z<=b&&x<=a)||(y<=a&&x<=b||y<=b&&x<=a)||(y<=a&&z<=b||y<=b&&z<=a))
        {
            out.println("The brick can pass through the hole");
        }
        else  out.println("The brick can not pass through the hole");

    }
}
