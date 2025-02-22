package com.egemendeveci._2_week;

public class _13_2_MethodIsReturn {
    //3-) Returnlu parametresiz
    public String metotReturnluParametresiz(){
        return "metotReturnluParametresiz";
    }

    //4- ) returnlu parametreli
    public  Integer metotReturnluParametreli(int number){
        return  number;
    }

    public static void main(String[] args) {
        _13_2_MethodIsReturn isReturn1= new _13_2_MethodIsReturn();

        String result1 = isReturn1.metotReturnluParametresiz();
        System.out.println(result1);

        Integer result2 = isReturn1.metotReturnluParametreli(31313131);
        System.out.println(result2);
    }

}
