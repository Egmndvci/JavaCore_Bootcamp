package com.egemendeveci._2_week;

import java.util.Scanner;

public class week2_examples_3 {
    public static void main(String[] args) {
        //kullanıcının verdiği pozitif bir sayıya kadar toplama yapan algoritma
        //şart 1: kullanıcı 100 den buyuk sayı girerse 100 e kadar toplasın
        //sart 2: kullanıcının verdigi sayılar icinde 47 varsa bunu toplamaya dahil etmesin.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int number = scanner.nextInt();
        // 100'den büyük sayılar için limiti 100 yap
        if (number > 100) {
            number = 100;
        }
        int toplam = 0;
        // 1'den kullanıcı sayısına kadar topla
        for (int i = 1; i <= number; i++) {
            if (i == 47) {
                continue; // 47'yi atla
            }
            toplam += i;
        }
        System.out.println("Verdiğin sayıya kadar toplam: " + toplam);
        scanner.close();
    }
}
