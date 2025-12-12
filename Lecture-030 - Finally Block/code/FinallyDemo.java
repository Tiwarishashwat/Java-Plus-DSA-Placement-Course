public class FinallyDemo {
    public static void main(String[] args) {
        int num =0;
        try {
            num = 10 / 0;
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e);
            return;
        }finally {
            System.out.println("Program ends here");
        }
        System.out.println("result is: " + num);

    }
}

