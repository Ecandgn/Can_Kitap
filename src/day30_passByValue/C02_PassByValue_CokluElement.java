package day30_passByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_PassByValue_CokluElement {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3, 5, 7, 1));
        // listedeki elementleri 3 arttırıp listenin yeni halini yazıran bir method oluşturun
        elementleriArtir(sayilar); // [6, 8, 10, 4]
        System.out.println(sayilar); //[6, 8, 10, 4] // yolcuların değişmesi demek aracın değiştiği anlamına gelmez.
         // 5 elemanlı yeni bir liste oluşturup sayılar list ine atayıp
        // sayilar listinin son halini yazdıran bir method oluşturun

        yeniListeOluşturMethodu(sayilar);
        // methodda sayilar listesinin son hali [0, 0, 0, 0, 0]
        System.out.println(sayilar); //[6, 8, 10, 4]

        // eğer methodda sayilar listesinin kendisine atama yapılırsa kabul etmez öncekini gösterir
        // ama sayilar listesinin elmanlarına atama yapılırsa araç değişmediği için elemanlar güncel haliyle main de gösterir.

    }

    public static void elementleriArtir(List<Integer> sayilar) {
        for (int i = 0; i < sayilar.size(); i++) {
            sayilar.set(i, sayilar.get(i) + 3);
        }
        System.out.println(sayilar);
    }

    public static void yeniListeOluşturMethodu(List<Integer> sayilar){
        List<Integer> yenilist=new ArrayList<>(Arrays.asList(0,0,0,0,0));
        sayilar=yenilist;
        System.out.println("Sayılar listesinin son hali : "+sayilar);

    }
}
