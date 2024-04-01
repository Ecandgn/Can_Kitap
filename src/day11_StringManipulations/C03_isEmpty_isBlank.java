package day11_StringManipulations;

public class C03_isEmpty_isBlank {
    public static void main(String[] args) {
        String str="";
        System.out.println(str.isBlank()); //true
        System.out.println(str.length()); //0
        System.out.println(str.isEmpty());

        String str2=" ";
        System.out.println(str2.length()); // 1
        System.out.println(str2.isEmpty()); //False
        System.out.println(str2.isBlank()); // true

        String str3="        ";
        System.out.println(str3.length()); // 8
        System.out.println(str3.isEmpty()); //False
        System.out.println(str3.isBlank()); // true



    }
}
