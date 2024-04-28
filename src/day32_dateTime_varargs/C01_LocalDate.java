package day32_dateTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate bugün=LocalDate.now();
        LocalDate dogumTarihi=LocalDate.of(1992,10,30);
        System.out.println(dogumTarihi.until(bugün)); // P31Y6M29D

        //verilen zamanlar arasındaki fark
        Period yasim=dogumTarihi.until(bugün);
        System.out.println(yasim.getYears()); //31

        System.out.println(dogumTarihi.until(bugün).getYears()); //31

        System.out.println(bugün.lengthOfMonth()); //30
        System.out.println(bugün.lengthOfYear()); // 366
// verilen yılın kaçıncı günü olduğunu donruru.
        System.out.println(bugün.getDayOfYear()); //119

    }
}
