package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task_3 {

    public static void main(String[] args) {

        Scanner sc =new Scanner(in);
        double z;
        out.println("enter x");
        double x=sc.nextInt();
        out.println("enter y");
        double y=sc.nextInt();
        z = ((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
        System.out.printf("The Result is = %.2f", z);
        sc.close();
    }

}
