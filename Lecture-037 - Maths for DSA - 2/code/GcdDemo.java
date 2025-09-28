public class GcdDemo {
    private int findGcd(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
//        cases for handling zero:
        if(a==0 && b==0) return 0;
        if(a==0) return b;
        if(b==0) return a;

        int min = Math.min(a,b);
        int res=1;
        for(int i=2;i<=min;i++){
            if(a%i==0 && b%i==0){
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        GcdDemo gd = new GcdDemo();
        int a=4;
        int b=0;
        System.out.println("GCD of " + a + " and " + b + " is: " + gd.findGcd(a,b));
    }
}
