package com.egemendeveci._1_week;

import java.util.Scanner;

public class week1_examples_1 {
    public static void main(String[] args) {
        // HOCANIN YAPTİGİ
        Scanner scanner = new Scanner(System.in);

        // Variable
        double aValue, bValue, result;

        System.out.println("Lütfen b değerini giriniz:");
        bValue = scanner.nextDouble();

        System.out.println("Lütfen a değerini giriniz:");
        aValue = scanner.nextDouble();

        // if else
        // ax+b=0 x=-b/a
        result = (-bValue / aValue);
        System.out.println("a değeri: " + aValue + " b değeri: " + bValue + " Sonuç: " + result);

        scanner.close();
        /*
        BENİM YAPTİGİM;
         //kullanıcıdan ax+b=0 denklemindeki a ve b değerlerini alarak x değerini bulan programı yazınız.
        Scanner scanner = new Scanner(System.in);
        System.out.println("a değerini giriniz:");
        int a = scanner.nextInt();
        System.out.println("b değerini giriniz:");
        int b = scanner.nextInt();
        int x = -b / a;
        System.out.println("bulduğunuz x değeri: " +x );
        scanner.close();
         */

    }
}
