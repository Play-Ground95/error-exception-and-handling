public class Demo3 {
    /*
     try... catch statement;

     try{

     }catch(){
        
     }
     */
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler((t, e)->{
            System.out.println("Ahuwuna......");
        });
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
        int[] numbers =new int[5];
        System.out.println(numbers[5]);
        System.out.println("Exit into myMethod2");
    }
}
