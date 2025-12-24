public class MultiTryCatchDemo {
    public static void main(String[] args) {
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[2]);

            String s = "shashwat";
            System.out.println(s.length());

            System.out.println(5/2);

        }
        catch (ArithmeticException e){
            System.out.println("you cannot divide by zero: " + e);
        }
        catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Either array index problem OR null pointer problem: " + e);
        }
        catch (Exception e){
            System.out.println("Received some other exception");
        }
    }
}
