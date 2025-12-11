public class UnsetBitDemo {
    private int unsetBit(int num, int k){
        return (~(1<<k) & num);
    }
    public static void main(String[] args) {
        int k=2;
        int num=13;
        UnsetBitDemo cb = new UnsetBitDemo();
        int res = cb.unsetBit(num,k);
        System.out.println("after unsetting kth bit, res = " + res);

    }
}
