public class CheckSetBitDemo {
    private boolean checkSetBit(int num, int k){
        return ((1<<k) & num) != 0;
    }
    public static void main(String[] args) {
        int k=1;
        int num=13;
        CheckSetBitDemo cb = new CheckSetBitDemo();
        if (cb.checkSetBit(num,k)){
            System.out.println("k th bit of " +num+" was set, k=" + k);
        }else{
            System.out.println("k th bit of " +num+" was not set, k=" + k);
        }
    }
}
