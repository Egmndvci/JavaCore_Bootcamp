package com.egemendeveci._1_week;

import java.util.Scanner;

public class _07_Scanner {
    public static void main(String[] args) {
        //field => alacaklarım
        String name,surname;

        //kullanıcıdan veri almak için kullanılır.next() kullansaydım yanından devam ederdik. nextLine() ile alt satıra geçer.String için geçerlidir.
        Scanner klayve= new Scanner(System.in);

        System.out.println("Lütfen Adınızı Giriniz:");
        name=klayve.nextLine();

        System.out.println("Lütfen Soyadınızı Giriniz:");
        surname=klayve.nextLine();

        System.out.println("Bildiğiniz diller ve teknolojiler");

        System.out.println("Merhaba "+name+" "+surname+"!");

        //kullanmadığım scanner nesnesini kapatalım.
        klayve.close();

    }
}
