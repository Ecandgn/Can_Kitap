package day03_scanner_dataCasting;

public class C04_Casting {
    public static void main(String[] args) {

//bir data turundeki datayi baska bir data turune cevirmeye data casting denir.
        boolean b1 = true;
        char ch1 = '$';
        byte byt1 = 73;
        int tamsayı = 23;
        float flt1 = 46.5f;
        double db1 = 44.1;
        String str = "Java Candır";

        // str = b1; // Atanmaz
        // str =ch1; // Atamaz

        db1 = byt1;
        db1 = tamsayı;
        flt1 = byt1;
        tamsayı = byt1;
        System.out.println(+db1 + "\n" + tamsayı);
        System.out.println(str);
        System.out.println("------------");
        //Kuçük data türündeki değeri büyük data türündeki değere otomatik atanır
        // Ancak tam tersi durumda  daraltmak istediğimiz değerin önüne dönüştürmek
        // istediğimiz data türünü yazarız
        System.out.println(flt1);
        db1 = 3216.7;
        flt1 = (float) db1;
        System.out.println(flt1);  //Casting Yapıldı

        byt1 = (byte) tamsayı;   //Casting Yapıldı
        System.out.println(byt1);

        byt1 = (byte) flt1;   //Casting Yapıldı
        System.out.println(byt1);

        byt1 = (byte) db1;   //Casting Yapıldı
        System.out.println(byt1);

        db1 = 130;
        byt1 = (byte) db1;   //Casting Yapıldı (Sayı Doğrusu üzerinde -128 ile 127 arasında değer verir)
        System.out.println(byt1);

        tamsayı = 780;

        byt1 = (byte)tamsayı;   //780 ni Byte a cast edilirse
        System.out.println(byt1);


    }
}
