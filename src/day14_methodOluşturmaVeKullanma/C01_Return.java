package day14_methodOluşturmaVeKullanma;

public class C01_Return {
    public static void main(String[] args) {
        /*
        Her Method bir iş yapmak için oluşturulur
        biz methodların yaptıkları işlem sonucunda
        bize döndürdüklerine bakarız
        methodların işlem sonucu verilem parametrelere göre değişecceği için return kelimesi daha
        çok data türünü belirtir.
         */

        String str ="Java Kolaydır.";
        System.out.println(str.substring(3)); // a kolaydır.
        System.out.println(str.indexOf("a")); //1
        System.out.println(str.indexOf("x")); // -1
        System.out.println(str.contains("Jav")); // true

    }
}
