public class Demo3 {

    /*  try...catch statment:

        uni-catch clause:
        try {



        } catch (Exception e){

        } 

        multi-catch clause:
        NumberFormatException|ArrayIndexOutOfBoundException|FormatException:= union type
        try {



        } catch (NumberFormatException|ArrayIndexOutOfBoundException|FormatException e){ 

        }         

        multiple-catch clauses:
        try {

        } catch (RuntimeException e){

        } catch (Exeception e){

        } catch (Throwable e){
            
        }
     */

    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler((t, e)->{
            System.out.println("Ahuuna...!");
        });
        System.out.println("Enter into the main");
        myMethod1();
        System.out.println("Exit from the main");
    }

    static void myMethod1(){
        System.out.println("Enter into myMethod1");
        try{
        myMethod2();
        }catch(Exception e){
            System.out.println("i got it");
        }
        System.out.println("Exit from myMethod1");
    }

    static void myMethod2(){
        System.out.println("Enter into myMethod2");
        try{
        int[] numbers = new int[5];
        System.out.println(numbers[5]);
        }catch(ArithmeticException exp){
            System.out.println("yes i can handle");
        }
        System.out.println("Exit from myMethod2");
    }    
}