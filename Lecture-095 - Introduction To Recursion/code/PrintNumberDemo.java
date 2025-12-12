public class PrintNumberDemo {
    private void print(int n) {
        if (n == 0) return; // Base case
        print(n - 1);       // Recursive call
        System.out.print(n + " "); // Task after recursion
    }

    public static void main(String[] args) {
        PrintNumberDemo pn = new PrintNumberDemo();
        pn.print(5);

    }
}
