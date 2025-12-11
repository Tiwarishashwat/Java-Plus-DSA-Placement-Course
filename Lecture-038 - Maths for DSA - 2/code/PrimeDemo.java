public class PrimeDemo {
    public boolean isPrime(int num){
        if(num<2){
            return false;
        }
        int sqrt = (int)Math.sqrt(num);
        for(int i=2;i<=sqrt;i++){
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        PrimeDemo pd = new PrimeDemo();
        int num = 1;
        System.out.println("Is " + num + " prime? " + pd.isPrime(num));
    }
}
