package com.egemendeveci._2_week;

public class _12_1_String1 {
    public static void main(String[] args) {
        // 1. yol
        // String vocabulary = new String("Java Öğreniyorum");
        //2. yol
        //String vocabulary = new String();

        //3. yol

        //STRİNG POOL : BELLEK YÖNETİMİ
        //vocabulary = "Java Öğreniyorum"
        String vocabulary1 = " Java Öğreniyorum ";
        String vocabulary2 = " Java Öğreniyorum ";

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

        String vocabulary3="java";
        if(vocabulary3.length()>=10) {
            //StringIndexOutOfBoundsException
            System.out.println(vocabulary3.substring(1, 10));// 1<=vocabulayr<=10-1
        }else {
            System.out.println("verdiğiniz kelime en fazlaa :" + vocabulary3.length() + "karakter vardır");
        }
        //contains : içinde Java var mi diye kontrol etttim true çıktı
        System.out.println(vocabulary1.contains("Java"));

        //Split

        //Replace: İstediğim kelimeyi bir kereliğine bunla değiştirdim. gerçegi degismedi.
        System.out.println("Değiştir:"+vocabulary1.replace("Java","Java 2025"));

        //birlestirme
        String concatenation= vocabulary1+vocabulary2+vocabulary3;
        System.out.println(concatenation);
        System.out.println(vocabulary1.concat("jsp").concat("jsf"));

        //birlestirme:StringBuilder( en mantıklısı bu)
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append(vocabulary1).append("jsp").append("jsf");
        String dataTostring1= stringBuilder.toString();
        System.out.println(dataTostring1);
        //birlestirme: StringBuffer
        StringBuffer stringBuffer= new StringBuffer();
        stringBuffer.append(vocabulary1).append("jsp").append("jsf");
        String dataTostring2= stringBuffer.toString();
        System.out.println(dataTostring2);

        //hashcode: her nesnennin parmak izi
        System.out.println(vocabulary1.hashCode());
        System.out.println(vocabulary2.hashCode());
        System.out.println(vocabulary3.hashCode());
    }
}
