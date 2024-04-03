package day31_dateTime;

import javax.sound.midi.Soundbank;
import java.time.LocalTime;
import java.time.ZoneId;

public class C01_LocalTime {
    public static void main(String[] args) {
        LocalTime saat = LocalTime.now();
        System.out.println(saat);

        for (int i = 0; i < 1000; i++) {
            String str = i + "";
            System.out.println(str);
        }
        System.out.println(saat);
        LocalTime bitis = LocalTime.now();
        System.out.println(bitis);
        /*
        Saat sabit bir variable olduğu için işlem için süre geçse de
        saat değeri değişmez
         */
        LocalTime japonsaati = LocalTime.now(ZoneId.of("Japan"));
        System.out.println("Japon Saati" + japonsaati);
        /*
        plus ve minus methodları saate keleme veya çıkarma yapar
         */
        System.out.println(saat.plusMinutes(267).plusHours(456));
        System.out.println(saat.minusSeconds(10500));

        /*
        with methodu saaatin istediğimiz bölümüne farklı değer atamamızı sağlar
         */
        System.out.println(saat.withHour(12));
        System.out.println(saat.withSecond(0).withNano(0));
/*
iki zamanı karşılaştırmak için before ve after kullanılabilir
 */
        // System.out.println(saat.isBefore(bitisSaati));
        //System.out.println(saat.isAfter(bitisSaati));

        /*
        get metodları saatin istediğimiz bölümlerini getirir
         */
        System.out.println(saat.getNano());
        // gece00:00'dan şu ana kadar geçen saniye veya nano saniyeyi verir
        System.out.println(saat.toNanoOfDay());
        System.out.println(saat.toSecondOfDay());

        LocalTime LoopBaslangic = LocalTime.now();
        Long loopBaslangicNano = LocalTime.now().toNanoOfDay();
        for (int i = 0; i < 10000; i++) {
            String str = i + "";

        }
        LocalTime LoopBitis = LocalTime.now();
        System.out.println("Loop Baslangıç:" + LoopBaslangic);
        System.out.println("Loop Bitiş:" + LoopBitis);

       // System.out.println("Looğ işlem süresi nano saniye olarak  ..." + (loopBaslangicNano + LoopBaslangic));


    }
}
