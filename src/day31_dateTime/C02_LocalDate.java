package day31_dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.chrono.JapaneseDate;

public class C02_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);

        // Japonyadaki tarihi yazdıralım
        LocalDate JaponyaTarih = LocalDate.now(ZoneId.of("Japan"));
        System.out.println("Japonya Tarih : " + JaponyaTarih);

        //İstenilen tarihi oluşturma
        LocalDate dogumTarihi1 = LocalDate.of(1995, 10, 23);
        LocalDate dogumTarihi2 = LocalDate.of(1995, Month.OCTOBER, 20);
        System.out.println(tarih.plusYears(5).plusMonths(7).plusDays(10));
// verilen doğum tarihlerini eski olanı yadır
        System.out.println(dogumTarihi1.isBefore(dogumTarihi2) ? dogumTarihi1 : dogumTarihi2);
        // verilen yılın artık yıl olup olmadığını yazdırın
        System.out.println(dogumTarihi1.isLeapYear());
    }
}
