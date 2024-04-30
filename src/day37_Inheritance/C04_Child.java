package day37_Inheritance;

public class C04_Child extends C03_Parent {
    C04_Child(){
        System.out.println("Child paremetresiz cons.");
    }

    public static void main(String[] args) {
        C04_Child child1=new C04_Child();
    }
}
