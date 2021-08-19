package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task_9 {
//    3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
public static void main(String[] args) {


    Scanner str = new Scanner(in);
    out.println("enter a(x,y)");
    int x1 = str.nextInt();
    int y1 = str.nextInt();
    out.println("enter b(x,y)");
    int x2 = str.nextInt();
    int y2 = str.nextInt();
    out.println("enter c(x,y)");
    int x3 = str.nextInt();
    int y3 = str.nextInt();

    out.println(((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1) == 0));
    {

    }
}

}
