package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        int dni = 2;

        while (a<b){
            a *= 2.7;
            dni++;
        }
        System.out.print(dni);
    }
}
