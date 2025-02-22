package com.egemendeveci._2_week;

public class _13_1_MethodIsNotReturn {
    //1- Metotlar( returnsuz parametresiz)
    public void metotReturnsuzParametresiz(){
        System.out.println("metotReturnsuzParametresiz");
    }
    //2- Metotlar(returnsuz parametreli => void=return demek)
    public static void metotReturnsuzParametreli(String name){
        System.out.println("metotReturnsuzParametreli"+name);
    }
    //OverLoading(aşırı yüklemek)
    public static void metotReturnsuzParametreli(String name,String surname){
        System.out.println("metotReturnsuzParametreli"+ name + surname);
    }
    //new
    //static
    public static void main(String[] args) {
        _13_1_MethodIsNotReturn data1= new _13_1_MethodIsNotReturn();
        data1.metotReturnsuzParametresiz();

        //instance(new) olmadan
        _13_1_MethodIsNotReturn.metotReturnsuzParametreli(" Egemen");
        _13_1_MethodIsNotReturn.metotReturnsuzParametreli(" Egemen","Deveci");

    }
}
