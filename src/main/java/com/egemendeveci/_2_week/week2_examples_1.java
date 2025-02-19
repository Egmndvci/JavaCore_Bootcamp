package com.egemendeveci._2_week;

import java.util.Scanner;

public class week2_examples_1 {
    public static void main(String[] args) {
        //kullanıcının verdiği bir sayının pozitif mi negatif mi olduğnu söyle.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bri sayı giriniz:");
        int number = scanner.nextInt();
        if(number > 0){
            System.out.println("Sayınız Pozitif");
        } else if (number == 0){
            System.out.println("sayı sıfırdır.");
        } else {
            System.out.println("sayı negatiftir.");
        }
        scanner.close();
    }
}
