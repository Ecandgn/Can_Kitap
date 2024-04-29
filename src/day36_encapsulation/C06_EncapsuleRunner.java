package day36_encapsulation;

public class C06_EncapsuleRunner {
    public static void main(String[] args) {
        C05_EncapsuleClass obj = new C05_EncapsuleClass();

        // obj.satisTutari = 30;
        // System.out.println(obj.satisTutari);

        // System.out.println(obj.toplamSatisMiktari);
        // obj.toplamSatisMiktari = 40;

        obj.setSatisTutari(50);
        //System.out.println(obj.setSatisTutari(20););
        obj.setSatisTutari(60);
        obj.setSatisTutari(20);
        obj.setSatisTutari(30);

        System.out.println(obj.getToplamSatisMiktari()); //160

        // obj.getToplamSatisMiktari() = 500;
        // toplam satis tutarini yazdirip gorebiliyoruz
        // ama toplam satis tutarina deger atayamiyoruz

       // obj.getEnCapsuleSayi() = 24;
      //  System.out.println(obj.getEnCapsuleSayi());

        obj.setEnCapsuleSayi(65);
        System.out.println(obj.getEnCapsuleSayi()); // 65
    /*
            Bir variable'i public yapmak ile,
            private yapip getter ve setter olusturmak
            erisim acisindan ayni sonucu verir

            Bazi developer'lar
            get ve set islemine vurgu yapmak icin
            public yapmak yerine
            encapsule edip,
            getter ve setter olusturmayi tercih ederler
         */

    }
}
