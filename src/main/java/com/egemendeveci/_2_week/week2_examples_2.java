package com.egemendeveci._2_week;

import java.util.Scanner;

public class week2_examples_2 {
    public static void main(String[] args) {
        //kullanıcının verdiği sayının çift mi tek mi olduğunu hesaplayan algoritma yap
        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen bir sayi gir ben onun cift mi tek mi olduğnu biliyim:");
        int number = scanner.nextInt();
        if(number%2==0){
            System.out.println("sayı çifttir.");
        }else if(number%2==1){
            System.out.println("sayı tektir.");
        }else{
            System.out.println("sayı negatiftir.");
        }
    }
}
