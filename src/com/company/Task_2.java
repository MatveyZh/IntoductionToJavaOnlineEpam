package com.company;

import java.util.Scanner;

import static java.lang.System.*;


public class Task_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(in);
        double z;
        out.println("enter a");
        double a=sc.nextInt();
        out.println("enter b");
        double b=sc.nextInt();
        out.println("enter c");
        double c=sc.nextInt();
        z = (b+Math.sqrt(Math.pow(b,2)+4*a*c))/(2*a)-Math.pow(a,3)*c+Math.pow(b,-2);
        System.out.printf("The Result is = %.2f", z);
        sc.close();
    }
}
