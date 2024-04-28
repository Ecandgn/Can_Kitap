package day34_StringBuilder;

public class C04_karsilastirma {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Ulvi");
        StringBuilder sb2 = new StringBuilder("Ulvi");
        String str = "Ulvi";

        System.out.println(sb1 == sb2); //false
        //System.out.println(str==sb2); farklı data türündeki non primitivaler için == kullanılmaz

        //equels
        System.out.println(sb1.equals(sb2));  // false
        System.out.println(str.equals(sb1)); // false

        System.out.println(sb1.equals(sb1)); //true

        StringBuilder sb3 = sb1;
        System.out.println(sb1.equals(sb3)); //true
        /*
        StringBuilderda metinleri karşılaştırmak için compare() kullanılır.
        */
        // compareTo()  0 döndürürse metinler aynı 0 dışındaki tüm değerler için metinler farklıdır.

// compareTo() iki sb'i ilk indexten başlayarak harf harf karşılaştırır
// eğer tüm indexlerdeki karakterler aynı ise sonuc 0 döner.
        //eğer herhangi bir index de farklı karakterler bulursa,
        // bu karakterlerin ascii kodları arasındaki farki dondurur ve işli sonlandırır.
        StringBuilder s1 = new StringBuilder("Java");
        StringBuilder s2 = new StringBuilder("Tava");
        StringBuilder s3 = new StringBuilder("Javaa");
        StringBuilder s4 = new StringBuilder("Java");
        StringBuilder s5 = new StringBuilder("Jaka");

        System.out.println(s1.compareTo(s2)); //-10
        System.out.println(s1.compareTo(s3)); //-1
        System.out.println(s1.compareTo(s4));//0
        System.out.println(s1.compareTo(s5));// 11

    }
}
