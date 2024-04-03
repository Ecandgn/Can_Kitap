package day32_dateTime_varargs;

import java.time.LocalDate;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate bugün=LocalDate.now();
        LocalDate dogumTarihi=LocalDate.of(1992,9,30);
        System.out.println(dogumTarihi.until(bugün));
        //verilen zamanlar arasındaki fark

        System.out.println(dogumTarihi.until(bugün).getYears());

        System.out.println(bugün.lengthOfMonth());
        System.out.println(bugün.lengthOfYear());
// verilen yılın kaçıncı günü olduğunu donruru.
        System.out.println(bugün.getDayOfYear());

    }
}
