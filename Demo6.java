public class Demo6 {
    public static void main(String[] args) {
        try {
            System.out.println("Hello");
            System.out.println(5/0);
            System.out.println("World");
        } catch (ArithmeticException|ArrayIndexOutOfBoundsException e) { //multiple catch clause
            
            System.out.println("Kawuda yako 0n bedapu paca.............");
        }
        // catch (ArrayIndexOutOfBoundsException e) {
            
        //     System.out.println("array-out");
        // }
        
        catch (Exception e) {
            
            System.out.println("Exeption");
        }
        catch (Throwable e) {
            
            System.out.println("throwble");
        }
        System.out.println("I am about to exit..");
    }
}
