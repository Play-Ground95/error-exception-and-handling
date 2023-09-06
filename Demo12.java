import java.sql.SQLException;

public class Demo12 {
    public static void main(String[] args) {
        myMethod1();
        myMethod2();
        try {
            myMethod3();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    static void myMethod1(){
        System.out.println("Enter to the myMethod 1");
        System.out.println(5/0);
         System.out.println("Exit to the myMethod 1");
    }
    static void myMethod2(){
        System.out.println("Enter to the myMethod 2");
        if(true)throw new ArithmeticException();
        System.out.println("Exit to the myMethod 2");
    }
    static void myMethod3() throws ClassNotFoundException {
        System.out.println("Enter to the myMethod 3");
        throw new ClassNotFoundException();
        
    }
    static void myMethod4() throws ClassNotFoundException{
        System.out.println("Enter to the myMethod 4");
        if(true)throw new ClassNotFoundException();
        if (true) throw new SQLException(null, null, 0);
        
    }

}
