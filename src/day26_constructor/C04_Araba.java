package day26_constructor;

public class C04_Araba {
    String marka = "Marka belirtilmedi";
    String model = "Model Belirtilmedi";
    int yil = 1900;
    int fiyat;

   C04_Araba(){

   }
C04_Araba(String mrk,String mdl, int yl,int fyt){
       marka=mrk;
       model=mdl;
       yil=yl;
       fiyat=fyt;
}
    C04_Araba(String mrk, int fyt) {
        marka = mrk;
        fiyat = fyt;
    }

    /*C01_Araba() {

    }
*/
    /*
    C01_Araba(String mrk, String mdl, int yl, int fyt) {
        marka = mrk;
        model = mdl;
        yil = yl;
        fiyat = fyt;

        System.out.println(marka);

    }
*/
}