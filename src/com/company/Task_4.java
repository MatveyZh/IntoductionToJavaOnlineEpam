package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task_4 {

//    4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//    дробную и целую части числа и вывести полученное значение числа.

    public static void main(String[] args) {
        Scanner sc =new Scanner(in);
        float z;
        out.println("enter R ");
        double R=sc.nextDouble();
        double n=Math.floor(R);
        R=R-n;
        R*=1000;
        R=R+n/1000;



        out.println("Reversed R is "+R);
    }
}
