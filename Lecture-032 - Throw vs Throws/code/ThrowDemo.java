public class ThrowDemo {
    public static void main(String[] args) {
        int age = 15;

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }

    // method that may throw exception
    public static void checkAge(int age) {
        if (age < 18) {
            // explicitly throwing exception
            throw new ArithmeticException("Age must be 18 or above!");
        } else {
            System.out.println("You are allowed to vote!");
        }
    }
}
