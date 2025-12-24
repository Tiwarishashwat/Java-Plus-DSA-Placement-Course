import java.util.Scanner;
public class TryCatchWithResourceDemo {
    public void tryAndFinally(){
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            if (sc != null) {
                sc.close(); // cleanup
                System.out.println("Scanner closed (finally).");
            }
        }
    }
    public void tryWithResource(){
        // Scanner is auto-closed after try block
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        // No finally needed!
        System.out.println("Scanner closed automatically.");
    }
    public static void main(String[] args) {
        TryCatchWithResourceDemo t = new TryCatchWithResourceDemo();
        t.tryAndFinally();
        t.tryWithResource();
    }
}

