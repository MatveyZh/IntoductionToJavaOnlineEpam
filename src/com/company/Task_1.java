package com.company;

import java.util.Scanner;

import static java.lang.System.*;



class Task_1 {
    //1. Найдите значение функции: z = ((a – 3 )*b/2) + c.
    public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    double z;

       System.out.println("enter a");
    double a = sc.nextInt();
       out.println("enter b");
    double b = sc.nextInt();
       out.println("enter c");
    double c = sc.nextInt();
    z =((a-3)*b/2)+c;
       out.println("Result is "+z);

       sc.close();

}}
