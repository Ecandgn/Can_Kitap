package day09switchStatement_StringManipulasions;

public class C09_CharArt {
    public static void main(String[] args) {
        String str = "Java Candır";
        System.out.println(str.charAt(0)); // J

        // Metindeki ikinci harfi büyük harf olarak yazdır.
        System.out.println(str.toUpperCase().charAt(1)); // A

        System.out.println(str.charAt(2)); //v
        //sonuncu harfi yazdırın
        System.out.println(str.charAt(10)); //r
        System.out.println(str.charAt(9)); //ı
// sondan 3. harfi yazdırın
        System.out.println(str.charAt(8)); //d

        System.out.println("---///---");
        String str1 = "Java Candır can)";
        System.out.println("Lenght : "+str1.length()); //Lenght : 16
        System.out.println(str1.charAt(15));


        //Dinamik bir kod olup son harfi yazdırır
        System.out.println(str1.charAt(str1.length() - 1));

        //sondan 3. harfi dinamik olarak yazdıralım.
        System.out.println(str1.charAt(str1.length()-3));

    }
}
