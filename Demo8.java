public class Demo8 {
    public static void main(String[] args) {
        System.out.println("Enter into the main");
        myMethod1();
        System.out.println("Exit from the main");
    }

    static void myMethod1() {
        System.out.println("Enter into myMethod1");

        myMethod2();

        System.out.println("Exit from myMethod1");
    }

    static void myMethod2() {
        System.out.println("Enter into myMethod2");
        //Class.forName("crazy"); //Risky method
        System.out.println("Exit from myMethod2");
    }
}
