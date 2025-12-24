public class PowerOfTwoDemo {
    private boolean isPowerOfTwo(int num){
        //odd num - > X -- following
        if((num & 1)!=0){
            return false;
        }
        return ((num & num -1)==0);
    }
    public static void main(String[] args) {
        int num=1;
        PowerOfTwoDemo cb = new PowerOfTwoDemo();
        boolean res = cb.isPowerOfTwo(num);
        System.out.println("is " + num + " power of 2? : "+ res);
    }
}
