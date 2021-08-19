package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task_8 {
//    2. Найти max{min(a, b), min(c, d)}.


    public static int min(int a,int b)
    {
        return a<=b? a: b;


    }
    public static int max(int a,int b)
    {
        return a>=b? a: b;
//        Scanner str = new Scanner(System.in);
//        System.out.println("enter a");
//        int a = str.nextInt();
//        System.out.println("enter b");
//        int b = str.nextInt();
//        System.out.println("enter c");
//        int c = str.nextInt();
//        System.out.println("enter d");
//        int d = str.nextInt();
//
//        System.out.println(max(min(a, b), min(c, d)));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        out.println("enter a");
        int a = scanner.nextInt();
        out.println("enter b");
        int b = scanner.nextInt();
        out.println("enter c");
        int c = scanner.nextInt();
        out.println("enter d");
        int d = scanner.nextInt();

        out.println("max{min(a, b), min(c, d)}= "+max(min(a, b), min(c, d)));
    }
}
