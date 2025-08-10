public class PromotionClass {
    public static void main(String[] args) {
        PromotionClass obj = new PromotionClass();
        int val1 = 10;
        int val2 = 20;
        long res = obj.add(val1,val2);
        System.err.println("result: " + res);

        long val3 = 15;
        long val4 = 25;
        long res1 = obj.add(val3,val4);
        System.err.println("result: " + res1);
    }

    private long add(long a, long b){
        return a + b;
    }
}
