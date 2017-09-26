package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double belki = scanner.nextDouble();
        double jiri = scanner.nextDouble();
        double vuglev = scanner.nextDouble();
        int n = scanner.nextInt();
        int no = 0;

        for(int i=0;i<n;i++){

            double nbelki = scanner.nextDouble();
            double njiri = scanner.nextDouble();
            double nvuglev = scanner.nextDouble();
            double kolvo = scanner.nextDouble();

            boolean nope = (nbelki*kolvo!=belki)&&(njiri*kolvo!=jiri)&&(nvuglev*kolvo!=vuglev);
            if (nope) no = 1;

        }

        System.out.print(no == 1 ? "NO" : "Yes");

    }
}
