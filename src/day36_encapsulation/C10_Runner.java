package day36_encapsulation;

public class C10_Runner {
    public static void main(String[] args) {

        C09_Corolla corolla = new C09_Corolla();

        System.out.println(corolla.marka); // Toyota
        System.out.println(corolla.model); //Corolla
        System.out.println(corolla.yakit); // Yakıt türü belirtilemdi
        System.out.println(corolla.yil); // 1900
        System.out.println(corolla.uretimYeri); // Sakarya
        System.out.println(corolla.aku); // İnci akü
        System.out.println(corolla.guvenlik); //ABS
        System.out.println(corolla.kasa); // Corolla Kasasi
        System.out.println(corolla.teker); // 15 inc pirelli teker
        System.out.println(corolla.motor); // cvvti
    }
}
