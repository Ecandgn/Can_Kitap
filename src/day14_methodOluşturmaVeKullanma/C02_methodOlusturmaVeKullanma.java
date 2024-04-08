package day14_methodOluşturmaVeKullanma;

public class C02_methodOlusturmaVeKullanma {
    public static void main(String[] args) {
        /*
        verilen iki sayıdan buyuk olanı yazdıran bir method oluşturun
        eğer sayılar eşit sayılarda büyük olan yoktur.
         */
  buyukOlaniYazdir(7,8);
  buyukOlaniYazdir(7,5);
  buyukOlaniYazdir(5,5);

   }

    // method clas içinde ama diğer methodların dışında oluşturulmalıdır.
    public static void buyukOlaniYazdir(int sayi1, int sayi2) {
        if (sayi1>sayi2){
            System.out.println("Sayılardan büyük olan :"+sayi1);
        } else if (sayi2>sayi1) {
            System.out.println("Sayılardan Büyük olan:"+sayi2);

        }else{
            System.out.println("Sayılardan büyük olan yoktur");
        }

    }
}