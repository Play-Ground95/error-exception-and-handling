import java.io.IOError;
import java.sql.SQLException;

public class Demo11 {
    public static void main(String[] args) {
       invoke();
       
    }

    static void invoke()throws Exception, Throwable{
        try {
         myMethod1();
        myMethod2();
        myMethod3();
        myMethod5();
        myMethod4();
        myMethod6();
        myMethod7();
       } catch (ClassNotFoundException|SQLException e) {
        
       }
    }

    static void myMethod1() throws ClassNotFoundException { //check exp //Risky

    }

    static void myMethod2() throws SQLException {//check exp //Risky

    }

    static void myMethod3() throws NullPointerException {

    }

    static void myMethod4() throws ArrayIndexOutOfBoundsException {

    }

    static void myMethod5() throws IOError {

    }

    static void myMethod6() throws Exception {//check exp //Risky

    }

    static void myMethod7() throws Throwable {//check exp //Risky

    }
}
