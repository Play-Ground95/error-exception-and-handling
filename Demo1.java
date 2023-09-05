public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Enter to main");
        myMethod1();
        System.out.println("Exit to main");

    }

    static void myMethod1() {
        System.out.println("Enter into myMethod1");
        myMethod2();
        System.out.println("Exit into myMethod1");
    }

    static void myMethod2() {
        System.out.println("Enter into myMethod2");
        myMethod3();
        System.out.println("Exit into myMethod2");
    }

    static void myMethod3() {
        System.out.println("Enter into myMethod3");
        //System.out.println(5/0);
        System.out.println("Exit into myMethod3");
    }
}