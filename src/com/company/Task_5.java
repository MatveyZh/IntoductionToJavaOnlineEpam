package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task_5 {

    public static void main(String[] args) {

//        5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//        данное значение длительности в часах, минутах и секундах в следующей форме:
//        ННч ММмин SSc.

        Scanner sc = new Scanner(in);
        out.println("enter T");
        int T = sc.nextInt();
        int hours = T / 3600;
        T = T - hours * 3600;
        int minutes = T / 60;
        int seconds = T - minutes * 60;

        DecimalFormat dF = new DecimalFormat("00");
        out.print(dF.format(hours) + "ч " + dF.format(minutes) + "мин " + dF.format(seconds) + "c ");
        sc.close();
    }
}
