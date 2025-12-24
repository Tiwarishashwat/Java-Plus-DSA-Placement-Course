public class SwapUsingXorDemo {
    public void swap(int a, int b){
        System.out.println("Before swap a: " + a + " b:" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap a: " + a + " b:" + b);
    }
    public static void main(String[] args) {
        SwapUsingXorDemo s = new SwapUsingXorDemo();
        int a = 13;
        int b = 11;
        s.swap(a,b);
    }
}
