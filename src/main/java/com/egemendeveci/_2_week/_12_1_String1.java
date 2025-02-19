package com.egemendeveci._2_week;

public class _12_1_String1 {
    public static void main(String[] args) {
        // 1. yol
        // String vocabulary = new String("Java Öğreniyorum");
        //2. yol
        //String vocabulary = new String();

        //3. yol
        //vocabulary = "Java Öğreniyorum"
        String vocabulary1 = " Ja va Öğreniyorum ";
        String vocabulary2 = " Ja va Öğreniyorum ";

        //lenght()
        System.out.println("Harf sayısı:"+ vocabulary1.length());

        //equal() eşit mi? ==
        System.out.println(vocabulary1==vocabulary2);
        System.out.println(vocabulary1.equals(vocabulary2));
        System.out.println(vocabulary1.equalsIgnoreCase(vocabulary2));// büyük küçük harf bakmaksizin eşit mi?

        //charAt : sıfırdan saymaya başlar. ve verdiğimiz sayı ilgili kelimenin harfini bize verir.
        System.out.println(vocabulary1.charAt(3));

        //trim : başında veya sonundaki boşlukları almaz.
        System.out.println(vocabulary1.trim().length());
        System.out.println(vocabulary1.equals(vocabulary2));

        //toUpperCase()=> hepsini gBÜYÜK yapar.
        System.out.println(vocabulary1.toUpperCase());

        //StartsWith()
        System.out.println(vocabulary1.startsWith("j")+ " ile mi başlıyor?");
        System.out.println(vocabulary1.endsWith(" ")+ " boşlukile mi bitiyorr?");

        // subString : parcalama
        System.out.println(vocabulary1.trim().substring(1));
        System.out.println(vocabulary1.trim().substring(2));
        System.out.println(vocabulary1.trim().substring(5));
        System.out.println(vocabulary1.trim().substring(1,10)); // 1<=vocabulayr<=10-1
    }
}
