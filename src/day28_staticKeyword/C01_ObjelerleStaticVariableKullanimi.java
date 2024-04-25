package day28_staticKeyword;

public class C01_ObjelerleStaticVariableKullanimi {
    public static void main(String[] args) {
        C00_Hastane hemsire1 = new C00_Hastane();


        System.out.println(hemsire1.personelAdres); //Adres Grilmedi
        System.out.println(hemsire1.personelIsmi);
        System.out.println(hemsire1.personelTel); //Telefon Girilmedi

        //static bir variable obje üzerinden ulaşmak için tamamını yazmamız gerekir otomatik getirmez.

        System.out.println(hemsire1.hastaneIsmi); //  Yıldız Hastanesi
        System.out.println(C00_Hastane.hastaneIsmi); // Yıldız Hastanesi

        System.out.println(hemsire1.bashekimismi); // Ilgar
        System.out.println(C00_Hastane.bashekimismi);  // Ilgar

        hemsire1.personelIsmi = "Meltem";
        hemsire1.personelAdres = "Sincan";
        hemsire1.hastaneAdresi = "Yeni Mah.";

        C00_Hastane hemsire2 = new C00_Hastane();
        System.out.println(hemsire2.personelAdres); //Adres Grilmedi
        System.out.println(hemsire2.personelIsmi); //Deger atanmadı
        System.out.println(hemsire2.personelTel); //Telefon Girilmedi

// Static variabler üzerinde yapılan değişiklikler kalıcı olur.
        System.out.println(hemsire2.hastaneAdresi); // Yeni Mah.

        hemsire2.personelIsmi = "Sumeyra";
        hemsire2.personelAdres = "Altındağ";
        hemsire2.personelTel = "321321456";
        hemsire2.bashekimismi = "Ramazan";
        hemsire2.hastaneAdresi = "Altındağ";

        C00_Hastane hemsire3 = new C00_Hastane();

        // Static variable'deki değişiklikler tüm variableları bağlar
        System.out.println(hemsire3.personelAdres); //Adres Grilmedi
        System.out.println(hemsire3.personelIsmi); //Deger atanmadı
        System.out.println(hemsire3.personelTel); //Telefon Girilmedi

        System.out.println(hemsire1.hastaneAdresi); // Altındağ
        System.out.println(hemsire2.hastaneAdresi);// Altındağ
        System.out.println(hemsire3.hastaneAdresi);// Altındağ

        System.out.println(hemsire1.personelIsmi); //Meltem
        System.out.println(hemsire2.personelIsmi); //Sumeyra
        System.out.println(hemsire3.personelIsmi); //Deger atanmadı


    }
}
