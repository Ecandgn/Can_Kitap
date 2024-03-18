package day05_Concatenation_MantıksalKarşılaştırma;

public class C02_Concatenation {
    public static void main(String[] args) {
        String s1="Java";
        String s2="Candır";
        String s3=" ";
        String s4=""; //hiçlik string olarak değerlendirilir.

        int a=5;
        int b=4;

        System.out.println(s1+a+b); //Java54
        System.out.println(a-b+s3+s1); //1 Java
        System.out.println(s1+s3+(a+b)); //Java 9
        System.out.println(s2+a*b); //Candır20
        System.out.println(((a+b)*5)+s1); //45Java

    }
}
