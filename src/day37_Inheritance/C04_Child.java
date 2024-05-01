package day37_Inheritance;

public class C04_Child extends C03_Parent {
    /*
    Child
     */
    C04_Child() {
        System.out.println("Child paremetresiz cons.");
    }

    C04_Child(int a) {
        System.out.println("int parametreleli cons.");
    }

    C04_Child(String s) {
        super(5); // görünür cons olduğu için super dikkate alıp int olan cons gider.
        System.out.println("Child String parametreli cons");
    }


    C04_Child(String a, int b) {
        super("Ali");
        System.out.println("Child 2 parametreli cons");
    }

    C04_Child(double c){
        super(2.3);
        System.out.println(c);
    }

    public static void main(String[] args) {
        // C04_Child child1 = new C04_Child();
        // C04_Child child2 = new C04_Child(4);
        //  C04_Child child3 = new C04_Child("ali");
        // C04_Child child4 = new C04_Child("a",1);
        C04_Child child5 = new C04_Child(1.1);
    }
}
