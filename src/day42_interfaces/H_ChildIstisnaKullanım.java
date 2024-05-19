package day42_interfaces;

public class H_ChildIstisnaKullanım implements G_interfacesdeBodysOlanMEthodOlurMu {

    @Override
    public void method1() {

    }


    // parent interface'de
    // default olarak isaretlenen method3()
    // ve static olarak isaretlenen method4()
    // istisnai methodlar oldugu icin IMPLEMENT edilmek ZORUNDA DEGILDIR

    public static void main(String[] args) {



        /*
            Bir interface'de sonradan eklenecek method'un
            child class'lar tarafindan implement edilmesini ZORUNLU olmaktan cikarmak icin
            default veya static keyword'leri kullanilabilir

            bu 2 kelime arasinda method olusturmada HICBIR FARK yoktur

            aralarindaki fark child class'lardan bu method'lara erisim YONTEMINDE'dir

            - static method'a static yontemle yani
              interfaceAdi.staticMethodAdi(); ulasabiliriz

            - default keyword ile olusturulan method'a ise
              obje uzerinden ulasabiliriz
         */

        G_interfacesdeBodysOlanMEthodOlurMu.method4();

        H_ChildIstisnaKullanım obj1 = new H_ChildIstisnaKullanım();
        obj1.method3();

        G_interfacesdeBodysOlanMEthodOlurMu obj2 = new H_ChildIstisnaKullanım();
        obj2.method3();



    }
}

