package com.egemendeveci._1_week;

import java.sql.SQLOutput;

public class _04_5_Cast {
    public static void main(String[] args) {
        //cast:dönüşüm
        //1-) Windenig Cast- Implict Cast
        byte cast1Byte= 100; // küçük olan veriyi
        int cast1Int = cast1Byte;// büyük olan verinin içine ekledim ( veri kaybı yoktur)
        System.out.println(cast1Int);

        //2-Narrowing Cast- Explicit Cast
        int cast2Int= 99999;
        byte cast2Byte = (byte) cast2Int;
        System.out.println(cast2Byte);//veri kaybım var. sonuca bakınca anlarsın.

        //3-) char=>ınt
        char cast3Char= 'A';
        int ascci= cast3Char;
        System.out.println(cast3Char+" harfi ascci olarak karsigi:"+ascci);

        int cast3Int=38;
        char ascci2= (char) cast3Int;
        System.out.println(cast3Int + " sayısının ascci karşılığı : "+ ascci2);

    }
}
