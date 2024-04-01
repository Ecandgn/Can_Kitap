package day09switchStatement_StringManipulasions;

public class C10_equals_equalsIgnorcase {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "Java";
        String str3 = "JAVA";
        String str4 = "Java";
        String str5 = "JAVA ";
/*
 equals() stringlerin birbirine eşit olup olmadığını kontrol eder
  */
        System.out.println(str1.equals(str2)); //False
        System.out.println(str1.equals(str3)); //False
        System.out.println(str1.equals(str4)); //False
        System.out.println(str2.equals(str4)); //True
        System.out.println(str1.equals(str5)); //False

        /*
        Eğer büyük küçük harf önemsiz ise amacımız sadece metin olarak aynı olup olmadıklarına
        bakmak ise  equalsIgnorCase() kullanılır
        */
        System.out.println("==========================");
        System.out.println(str1.equalsIgnoreCase(str2)); //True
        System.out.println(str1.equalsIgnoreCase(str3)); //true
        System.out.println(str1.equalsIgnoreCase(str4)); //True
        System.out.println(str2.equalsIgnoreCase(str4)); //True
        System.out.println(str1.equalsIgnoreCase(str5)); //False

        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        String s4 = "ja" + "va";
        String a = "ja";
        String b = "va";
        String s5 = a + b;
        System.out.println("=====================");
        System.out.println(s1.equalsIgnoreCase(s2)); //True
        System.out.println(s1.equalsIgnoreCase(s3)); //True
        System.out.println(s1.equalsIgnoreCase(s4)); //True
        System.out.println(s1.equalsIgnoreCase(b)); //False
        System.out.println(s1.equalsIgnoreCase(s5)); //True
        System.out.println(s1.equalsIgnoreCase("java"));

        System.out.println("=====================");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s5);

        System.out.println("=======================");
        // Java'da metin ifadelerinin karşılaştırılması için == kullanılmaz.


    }
}
