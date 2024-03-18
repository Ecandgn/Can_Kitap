package day05_Concatenation_MantıksalKarşılaştırma;

public class C01_Concatenation {
    public static void main(String[] args) {
        //Javada metinsel ifadeler + işlemi yapılabilir.

        String str1 = "Java";
        String str2 = "Candır";
        System.out.println(str1 + "  " + str2);
        System.out.println(str1 + 5 + str2); //String herşeyi kendisine benzetir 5 artık sayı değil

        String a = "Hello";
        int b = 2;
        int c = 3;
        System.out.println(a + b + c); //Hello23
        System.out.println(c + b + a); //5Hello
        System.out.println(a + (b + c)); //Hello5
        System.out.println(a + b * c); //Hello6

    }
}
