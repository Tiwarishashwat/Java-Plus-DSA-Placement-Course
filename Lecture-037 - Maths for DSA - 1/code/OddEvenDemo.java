public class OddEvenDemo {
    public void findOddEven(int num){
        if(num%2==0){
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is odd");
        }
    }
    public static void main(String[] args) {
        OddEvenDemo oe = new OddEvenDemo();
        oe.findOddEven(8);
    }
}
