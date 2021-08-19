package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task_12 {

//    Циклы
//1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//    все числа от 1 до введенного пользователем числа.
public static void main(String[] args) {


    Scanner str = new Scanner(in);

    out.println("enter x");
    int x = str.nextInt();
    int sum = 0;


    if (x <= 0) {

        out.println("число должно быть больше 0");

    } else {
        for (int i = 1; i < x; i++) {
            sum += i;
        }
        String answer = String.format("сумма чисел от 1 до %s равна %s", x, sum);
        out.println(answer);

    }

}
}
