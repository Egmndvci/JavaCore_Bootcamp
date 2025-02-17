package com.egemendeveci._notes_;

public class _05_operators {
    public static void main(String[] args) {
        // Aritmetik Operatörler
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("a + b = " + c);

        c = a - b;
        System.out.println("a - b = " + c);

        c = a * b;
        System.out.println("a * b = " + c);

        c = b / a;
        System.out.println("b / a = " + c);

        c = b % a;
        System.out.println("b % a = " + c);

        // İlişkisel Operatörler
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));

        // Mantıksal Operatörler
        boolean x = true;
        boolean y = false;

        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + !x);

        // Atama Operatörleri
        int d = 10;
        int e = 20;
        d += e;
        System.out.println("d += e = " + d);

        d -= e;
        System.out.println("d -= e = " + d);

        d *= e;
        System.out.println("d *= e = " + d);

        d /= e;
        System.out.println("d /= e = " + d);

        d %= e;
        System.out.println("d %= e = " + d);

        // Arttırma ve Azaltma Operatörleri
        int f = 10;
        int g = 20;
        f++;
        g--;
        System.out.println("f++ = " + f);
        System.out.println("g-- = " + g);

        // Ünary Operatörler
        int h = 10;
        System.out.println("++h = " + ++h);
    }
}
