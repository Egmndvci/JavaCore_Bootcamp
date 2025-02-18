package com.egemendeveci._1_week;

public class _04_4_Autoboxing {
    public static void main(String[] args) {
        //Autoboxing: primitive => wrapper type dönüşümü
        int primitiveValue = 100;
        Integer wrapperValue = primitiveValue; // Autoboxing
        System.out.println("primitive type:"+ primitiveValue + " wrapper type:"+ wrapperValue);

        //unboxing: wrapper type => primitive dönüşümü
        Integer wrapperValue2 = 200;
        int primitiveValue2 = wrapperValue; // Unboxing
        System.out.println("wrapper type:"+ wrapperValue2 +" primitive type:"+ primitiveValue2 );


    }
}
