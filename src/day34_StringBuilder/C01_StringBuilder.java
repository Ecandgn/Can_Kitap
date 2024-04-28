package day34_StringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.length()); //0
        System.out.println(sb1.capacity()); //16

        StringBuilder sb2 = new StringBuilder("Deneme");
        System.out.println(sb1.length()); //0
        System.out.println(sb2.capacity()); //22

        StringBuilder sb3 = new StringBuilder(7);
        System.out.println(sb3.length()); // 0
        System.out.println(sb3.capacity()); //7

        sb3.append("Java");
        System.out.println(sb3); // java
        System.out.println(sb3.length()); // 4
        System.out.println(sb3.capacity()); //7

        sb3.append(" Candır");
        System.out.println(sb3); // java candır
        System.out.println(sb3.length()); //11
        System.out.println(sb3.capacity()); // 7*2+2 =16

        sb3.append(false);
        sb3.append(44);
        System.out.println(sb3); // Java Candırfalse44
        System.out.println(sb3.length()); //18
        System.out.println(sb3.capacity()); // 16*2+2=34

        sb3.trimToSize(); // kapasiteyi Lengt'e indirger
        System.out.println(sb3);  //Java Candırfalse4
        System.out.println(sb3.length()); //18
        System.out.println(sb3.capacity()); //18

        String str = "Malatya";
        sb3.append(str, 4, 6); //Java Candırfalse44ty
        System.out.println(sb3);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity()); //20
        sb3.trimToSize(); // 38
        System.out.println(sb3); // Java Candırfalse44ty
        System.out.println(sb3.length()); //20

    }
}
