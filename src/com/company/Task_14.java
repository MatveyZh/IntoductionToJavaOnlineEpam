package com.company;

import static java.lang.System.out;

public class Task_14 {
//    3. Найти сумму квадратов первых ста чисел
public static void main(String[] args) {

    int sum = 0;
    for (int x = 1; x <= 100; x += 1) {

        sum += x * x;
    }


    out.println("the sum of the squares of the first hundred numbers=" + sum);

}
}
