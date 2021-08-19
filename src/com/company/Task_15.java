package com.company;

import java.math.BigInteger;

import static java.lang.System.out;

public class Task_15 {
//    4. Составить программу нахождения произведения квадратов первых двухсот чисел.
public static void main(String[] args) {
    BigInteger product = BigInteger.valueOf(1);
    for (int x = 1; x <= 200; x += 1) {

        product = product.multiply(BigInteger.valueOf((long) x * x));
        ;

    }


    out.println("the product of the squares of the first two hundred numbers= " + product);
}

}
