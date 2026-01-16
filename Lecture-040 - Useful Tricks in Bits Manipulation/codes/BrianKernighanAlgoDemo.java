public class BrianKernighanAlgoDemo {
    private int countBitsUsingBrianAlgo(int num){
        int count=0;
        while(num!=0){
            num = num & (num-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int num=-13;
        BrianKernighanAlgoDemo cb = new BrianKernighanAlgoDemo();
        int res = cb.countBitsUsingBrianAlgo(num);
        System.out.println("set bits in "+num+" is " + res);
    }
}
