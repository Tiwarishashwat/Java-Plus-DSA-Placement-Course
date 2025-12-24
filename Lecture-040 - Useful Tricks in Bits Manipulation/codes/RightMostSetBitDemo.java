public class RightMostSetBitDemo {
    private int rightMostSetBit(int num){
        return (num & -num);
    }
    public static void main(String[] args) {
        int num=18;
        RightMostSetBitDemo cb = new RightMostSetBitDemo();
        int res = cb.rightMostSetBit(num);
        System.out.println("res with only right most set bit of " + num + " is: "+ res);
    }
}
