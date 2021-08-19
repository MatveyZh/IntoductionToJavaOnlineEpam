package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task_19 {
//8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
    public static void main(String[] args) {

        Scanner str = new Scanner(in);

        out.println("enter m");
        int m = str.nextInt();
        out.println("enter n");
        int n = str.nextInt();
        int M=m;
        int N=n;
        out.println("numbers ");
        while(M>0)
        {
            while(N>0)
            {
                if (N%10==M%10)
                {
                    out.print(N%10+" ");
                    break;
                }
                N=N/10;
            }
            M/=10;
            N=n;
        }


    }
}
