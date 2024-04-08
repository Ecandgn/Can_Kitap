package day14_methodOluşturmaVeKullanma;

public class C03_MethodOlusturma {
    public static void main(String[] args) {


        //verilen bir metnin tersten yazdıran bir method oluturun
        terstenYazdir("Method oluşturma Güzelmiş.");
        terstenYazdir("123456654");
        terstenYazdir("Emrtah");
    }

    public static void terstenYazdir(String metin) {
        for (int i = metin.length()-1; i >= 0 ; i--) {
            System.out.print(metin.charAt(i));

        }
        System.out.println("");
    }
}
