package day26_constructor;

public class C01_Araba {
    String marka = "Marka belirtilmedi";
    String model = "Model Belirtilmedi";
    int yil = 1900;
    int fiyat;

    C01_Araba() {

    }
    /*
    bir obje oluşturulduğunda clasdaki standart özelliklere sahip olur ve
    sonradan tek tek bu özelliklere değer ataması yapılır araba1 gibi

     */

    C01_Araba(String mrk, String mdl, int yl, int fyt) {
        marka = mrk;
        model = mdl;
        yil = yl;
        fiyat = fyt;
      //  marka= opel;
        System.out.println(marka);
    }

    @Override
    public String toString() {
        return "Araba özellikler: " +
                "marka :" + marka + '\'' +
                ", model :" + model + '\'' +
                ", yil :" + yil +
                ", fiyat=" + fiyat;
    }
}
