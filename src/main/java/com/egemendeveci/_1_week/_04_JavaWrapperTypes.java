package com.egemendeveci._1_week;

public class _04_JavaWrapperTypes {
    public static void main(String[] args) {
        //primitivetype null veremezsiniz. Daha çok primitive kullanıyoruz çünkü wrapper type'lar daha fazla yer kaplar.
        short primitiveShort = 10;
        int primitiveInt = 10;
        long primitiveLong = 10;
        float primitiveFloat = 10.0f;
        double primitiveDouble = 10.0;
        boolean primitiveBoolean = true;
        char primitiveChar = 'a';
        // WRAPPER TYPES NEW YOKSA
        //Wrapper Types null veremezsiniz
        Byte wrapperTypeByte= 127;
        wrapperTypeByte=null;
        System.out.println(wrapperTypeByte);
        short wrapperShort = 10;
        Integer wrapperInt = 10;
        Long wrapperLong = 10L;
        Float wrapperFloat = 10.0f;
        Double wrapperDouble = 10.0;
        Boolean wrapperBoolean = true;
        Character wrapperChar = 'a';


        // WRAPPER TYPES ÖZELLİKLERİ
        System.out.println(Integer.MAX_VALUE); // Integer'ın maximum değeri
        System.out.println(Integer.MIN_VALUE); // Integer'ın minimum değeri
        System.out.println(Integer.SIZE); // Integer'ın boyutu
        System.out.println(Integer.BYTES); // Integer'
    }
}
