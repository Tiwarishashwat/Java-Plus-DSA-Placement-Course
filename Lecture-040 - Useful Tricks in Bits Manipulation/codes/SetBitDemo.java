public class SetBitDemo {
    private int setBit(int num, int k){
        return (1<<k | num);
    }
    public static void main(String[] args) {
        int k=2;
        int num=16;
        SetBitDemo cb = new SetBitDemo();
        int res = cb.setBit(num,k);
        System.out.println("after setting kth bit, res = " + res);

    }
}

