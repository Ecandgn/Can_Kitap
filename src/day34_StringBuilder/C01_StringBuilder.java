package day34_StringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        StringBuilder sb2 = new StringBuilder("Deneme");
        System.out.println(sb1.length());
        System.out.println(sb2.capacity());

        StringBuilder sb3 = new StringBuilder(7);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

        sb3.append("Java");
        System.out.println(sb3);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

        sb3.append(" Candır");
        System.out.println(sb3);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

        sb3.append(false);
        sb3.append(44);
        System.out.println(sb3);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

        sb3.trimToSize();
        System.out.println(sb3);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

        String str = "Malatya";
        sb3.append(str, 4, 6);
        System.out.println(sb3);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());
sb3.trimToSize();
        System.out.println(sb3);
        System.out.println(sb3.length());

    }
}
