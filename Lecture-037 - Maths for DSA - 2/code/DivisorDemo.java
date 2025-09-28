public class DivisorDemo {
    public void printDivisors(int num){
        int sqrt = (int)Math.sqrt(num);
        for(int i=1;i<=sqrt;i++){
            if(num%i==0){
                System.out.print(i + " ");
                if(num/i != i){
                    System.out.print(num/i + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        DivisorDemo dd = new DivisorDemo();
        dd.printDivisors(216);
    }
}
