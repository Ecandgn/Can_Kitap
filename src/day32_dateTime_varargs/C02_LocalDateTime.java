package day32_dateTime_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C02_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
        /*
        Eğer tarih ve saati istediğiniz bir form da yazdırmak isterseniz
        önce o formatı oluşturmalısınız format oluşturduktan sonra ldt'yi istenilen formatta
        yazdıra ,bilirsiniz
         */

        /*
        GUN
                 d : basta 0 varsa onu yazmadan gun numarasi
                 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
                 DDD : yilin kacinci gunu oldugunu yazar
                 E, EE, EEE : gun isminin ilk 3 harfi
                 EEEE : gun isminin tamamini
             AY (Ay icin M, dakika icin m kullanilir)
                 M : basta 0 varsa onu yazmadan ay numarasi
                 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
                 MMM : Ay isminin ilk 3 harfi
                 MMMM : Ay isminin tamami
            Yil   y veya Y kullanilabilir
                 YY : yilin son iki rakamini
                 YYYY : Yilin tamamini
            Saat
                 Saat : 24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h
                 HH : saatin tamami, tek rakamli saat olursa 02 gibi
                 H  : tek rakamli saat olursa sadece saati
                 a yazarsak AM veya PM degerini yazar
         */
        //Tarih 03 Apr 24 şeklinde yazdıralım
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dde%sa,MMM yy");
        System.out.println(ldt.format(dtf1));
        // 3 April 2024
DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d MMMM YYYY");
        System.out.println(ldt.format(dtf2));
        //03 April Wednesday
DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd MMMM EEEE");
        System.out.println(ldt.format(dtf3));
        // 3/4/2024 20:33
DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("d/M/yyyy HH:mm");
        System.out.println(ldt.format(dtf4));
        //8:33 pm
DateTimeFormatter dtf5=DateTimeFormatter.ofPattern("h:mm a");
        System.out.println(ldt.format(dtf5));

    }
}
