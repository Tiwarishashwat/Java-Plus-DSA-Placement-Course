public class EuclideanAlgorithmDemo {
    private int findGcd(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        if(b>a){
            return findGcd(b,a);
        }
//        log(min(a,b))
        while(b>0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        EuclideanAlgorithmDemo gd = new EuclideanAlgorithmDemo();
        int a=-12;
        int b=-18;
        System.out.println("GCD of " + a + " and " + b + " is: " + gd.findGcd(a,b));
    }
}
