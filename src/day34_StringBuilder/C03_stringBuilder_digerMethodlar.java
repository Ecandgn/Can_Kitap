package day34_StringBuilder;

public class C03_stringBuilder_digerMethodlar {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java Candır.");
        // bize stringbuilder döndürmeyen methodlar
        //stringbuilderda kalıcı değişiklik yapmaz.

        System.out.println(sb.indexOf("a"));
        System.out.println(sb); //Java Candır.
        System.out.println(sb.substring(2, 4)); // va
        System.out.println(sb.charAt(0)); // j
        System.out.println(sb); // Java Candır.

        /*
        eğer string buldirlerda olmayan fakat stringde olan bir methodu kullanmak isterseniz ilk önce toString ile
        stringbuildera çevirip sonra string method larını kullanabilirsiniz
        bu yöntem ile yapılan değişiklikler kalıcı olamz
         */

        // sb CAn içerir mi ?
        System.out.println(sb.toString().contains("Can")); //true

        // sb java ile mi başlıyor ?
        System.out.println(sb.toString().startsWith("Java")); // true

        // sb yi büyük harfe çevirin
        //sb=sb.toString().toUpperCase();
        sb = new StringBuilder(sb.toString().toUpperCase());
        System.out.println(sb); // JAVA CANDIR.

    }
}
