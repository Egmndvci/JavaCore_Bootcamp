package com.egemendeveci._notes_;

import java.util.Scanner;

public class _00_1Example {
    public static void main(String[] args) {
        //kullanıcıdan ax+b=0 denklemindeki a ve b değerlerini alarak x değerini bulan programı yazınız.
        Scanner scanner = new Scanner(System.in);
        System.out.println("a değerini giriniz:");
        int a = scanner.nextInt();
        System.out.println("b değerini giriniz:");
        int b = scanner.nextInt();
        int x = -b / a;
        System.out.println("bulduğunuz x değeri: " +x );
        scanner.close();


    }
}
