package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task_16 {

    //        5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//        заданному е. Общий член ряда имеет вид:
    public static void main(String[] args) {


        Scanner str = new Scanner(in);

        out.println("enter e");
        double e = str.nextDouble();
        double sum=0;
        int n=0;
        double a;
        while((a=1/Math.pow(2,n)+1/Math.pow(3,n))>=e) {

            sum += a;
            n++;
        }


        out.println("sum= " + sum);

    }
}
