package com.egemendeveci._2_week;

public class _10_1_Loop {
    public static void main(String[] args) {
        //FOR DÖNGÜSÜ
        // i++ yı i=+1 ve i=i+1 olarak yazabiliriz
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "");
        }
        //for döngüsü sonsuzluk
        //for(;;){}


        //WHİLE DÖNGÜSÜ
        int i = 1;
        while (i <= 10) {
            System.out.print(i + "");
            i++;
        }
        //while döngüsü sonsuzluk
        //while(;true){}


        //DOWHİLE DÖNGÜSÜ (şart sağlansın ya da sağlanmasın bir kere çalışır.
        do {
            System.out.println(i + "");
            i++;
        } while (i <= 10);
    }
}
