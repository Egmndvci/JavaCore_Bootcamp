package com.egemendeveci._notes_;

import java.util.Scanner;

public class _00_2Example {
    public static void main(String[] args) {
        //Kullanıcıdan Stantigrat(celsius) değerini alarak Fahrenheit değerini bulan programı yazınız.
        //F = C * 1.8 + 32
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Lütfen Stantigrat(celsius) değerini giriniz:"));
        int C= scanner.nextInt();
        int F = C * 9/5 + 32 ;
        System.out.println("Fahrenheit cinsinden değeri:"+ F );
        scanner.close();


    }
}
