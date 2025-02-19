package com.egemendeveci._2_week;

import java.util.Scanner;

public class _09_1_Conditional {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz:");
        int number=scanner.nextInt();
        if(number > 0){
            System.out.println("pozitif");
        }else {
            System.out.println("negatif");
        }
        scanner.close();

        //ternary yapısı (kısaltılmıs halidir.)
        String result =(number > 0) ? "pozitif sayıdır":"negatif sayıdır";
        System.out.println(result);


        //multiple yapısı
        if(number==1){
            System.out.println("sayi 1 dir");
        }else if (number==2){
            System.out.println("sayi 2 dir");
        }else {
            System.out.println("sayi 1 veya 2 degildir");
        }

        //switch-case yapisina benzetme
        switch (number){
            case 1:
                System.out.println("sayi 1 dir");
                break;
            case 2:
                System.out.println("sayi 2 dir");
                break;
            default:
                System.out.println("sayi 1 veya 2 degildir");
        }


        
    }
}
