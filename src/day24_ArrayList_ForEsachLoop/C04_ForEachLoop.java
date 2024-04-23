package day24_ArrayList_ForEsachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_ForEachLoop {
    public static void main(String[] args) {
        /*
      Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.
         */

        int[] arr ={3,3,4,4,5,4,3,2,6,5,4,3,2,3};
        List<Integer>benzersizlist=new ArrayList<>();
        for (int each: arr){
            if (!benzersizlist.contains(each)){
                benzersizlist.add(each);
            }
        }
        System.out.println(benzersizlist);

        // arrayden eleman silemediğimiz için istediğimiz elemnte sahip yeni bir array oluşturalım

        arr = new  int[benzersizlist.size()];
        for (int i = 0; i < args.length; i++) {
            arr[i]=benzersizlist.get(i);
        }
        System.out.println("arrayin son hali : "+benzersizlist);
    }
}
