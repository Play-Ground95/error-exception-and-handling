public class Demo2 {
    public static void main(String[] args) {
    //    Thread.currentThread().setUncaughtExceptionHandler(
    //     new UncaughtExceptionHandler() {
        
    //         @Override
    //         public void UncaughtException(Thread t, Throwble e){
    //             System.out.println("adata athi mama ynwa");
    //         }
    //    });
    Thread.setDefaultUncaughtExceptionHandler((t,e)->{
        //logging
        System.out.println(Thread.currentThread());
        System.out.println("menna meya yanawa"+ t.getName());
        System.out.println("mata athi mama ynwa whottoo....");
        e.printStackTrace();
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
        String something = null;
        System.out.println(something.toUpperCase());
        System.out.println("Exit into myMethod2");
    }
}
