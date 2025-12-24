public class FactorialDemo {
    // (a * b) % m = (a%m * b%m) % m
    int m = 10000007;
    private void printFactorial(int num){
        int res=1;
        for(int i=num;i>=2;i--){
            res = (res * i%m) % m;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        FactorialDemo fd = new FactorialDemo();
        fd.printFactorial(21);
    }
}
