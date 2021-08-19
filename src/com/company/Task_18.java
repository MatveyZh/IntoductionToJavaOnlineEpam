package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task_18 {

//7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//    m и n вводятся с клавиатуры.

    public static void main(String[] args) {
        Scanner str = new Scanner(in);

        out.println("enter m");
        int m = str.nextInt();
        out.println("enter n");
        int n = str.nextInt();

        out.println("divisors ");
        for (int i=m;i<n;i++)
        {
            out.print(i+": ");

            for (int j=2;j<i;j++)
            {
                if(i%j==0)
                    out.print(j+" ");
            }
            out.println();
        }
    }
}
