package com.egemendeveci._2_week;

import java.util.Scanner;

public class week2_examples_3 {
    public static void main(String[] args) {
        //kullanıcının verdiği pozitif bir sayıya kadar toplama yapan algoritma
        //şart 1: kullanıcı 100 den buyuk sayı girerse 100 e kadar toplasın (break)
        //sart 2: kullanıcının verdigi sayılar icinde 47 varsa bunu toplamaya dahil etmesin.(continue)
        //cikan sonuc tek mi cift mi?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int number = Math.abs(scanner.nextInt());//sayi negatif verirse fln mutlak degerle pozitife donusturmek icinn
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            //eger 47 varsa toplama
            if (i == 47) {
                continue; // 47'yi atla
            }
            if (i > 100) {
                break; // 100'den büyük sayılarda toplamauyı durdur.
            }
            sum+= i;
            //sum = sum+i de yazabilirsin
        }
        System.out.println("Verdiğin sayıya kadar toplam: " + sum);
        if (number%2==0){
            System.out.println("çıkan sonuc aynı zamanda cifttir.");
        }else{
            System.out.println("çıkan sonuç aynı zamanda tektir.");
        }
        scanner.close();
    }
}
