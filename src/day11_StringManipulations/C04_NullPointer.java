package day11_StringManipulations;

public class C04_NullPointer {
    public static void main(String[] args) {
        String str1;
//sırf yazdıra bilmek için hiçlik atanır.
        String str2 = "";
        System.out.println(str2); // boş satır yazdırır.
        // bu durumda yazdırılabilir ama hiçlikte olsa bu veraibla değer atandığı için
        // boş olarak değerlendirmez.
        /*
        java değer atamadan variable kullana bilmemiz için
         */

        String str3 = null;
        System.out.println(str3);

        String str4 = "Java";
        System.out.println(str3 + str4);
    /*
    null sadece yazdırabilir ama başka işlem yaptıramazlar.
         */
    }
}
