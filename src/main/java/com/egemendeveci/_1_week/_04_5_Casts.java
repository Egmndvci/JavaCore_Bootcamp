package com.egemendeveci._1_week;

import java.sql.SQLOutput;

public class _04_5_Casts {
    public static void main(String[] args) {
        //cast:dönüşüm
        //1-) Windenig Cast- Implict Cast ( Kapalı)
        byte cast1Byte= 100; // küçük olan veriyi
        int cast1Int = cast1Byte;// büyük olan verinin içine ekledim ( veri kaybı yoktur)
        System.out.println(cast1Int);

        //2-Narrowing Cast- Explicit Cast(Açık) Daha büyük bir türü daha küçük bir veriye dönüştürmek için kullanılır.
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

        //4-) String => int
        String cast4String="10";
        String cast4String2="10";
        int cast4Int = Integer.valueOf(cast4String); // string ifadeyi integer ifadeye çevirdim.bunu farklı şekilde de yapabilirsin mesela;
        int cast4Int2 = Integer.parseInt(cast4String2);
        System.out.println(cast4String+20);// çevirmezsen sonuçu yan yana yazar.
        System.out.println(cast4Int+20);// çevirirsen toplar gördüğün gibi sonuçta.
        System.out.println(cast4Int2+20);// farklı yöntemini cast4ınt2 de yaptim böyle de yapilabilir.

        //5-) int=>String
        int cast5Int=55;
        String cast5String1=String.valueOf(cast5Int);
        System.out.println(cast5String1);

    }
}
