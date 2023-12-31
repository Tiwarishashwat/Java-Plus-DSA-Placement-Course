public class BitManipulation {
    public static void main(String[] args) {
        printBits(67);
        printOddEven(54);
        int res1 = setIthBit(32,4);
        printBits(res1);
         int res2 = toggleIthBit(33,4);
         printBits(res2);
        int res3 = unSetIthBit(33,0);
        printBits(res3);
            isPowerOfTwo(33);
        int res4 = unSetRightMostSetBit(48);
        printBits(res4);
        NoOfSetBits(67);
    }
    public static void printBits(int num){
        for(int i=7;i>=0;i--){
            System.out.print((num>>i) & 1);
        }
        System.out.println();
    }
    public static void printOddEven(int num){
        if(isBitSet(num,0)){
            System.out.println("Number is odd");
        }
        else {
            System.out.println("Number is even");
        }

    }

    public static boolean isBitSet(int num, int bit){
        int res = num & (1<<bit);
        return (res==0)?false:true;
    }

    public static int setIthBit(int num, int bit){
        return num | (1<<bit);
    }

    public static int toggleIthBit(int num, int bit){
        return num ^ (1<<bit);
    }

    public static int unSetIthBit(int num, int bit){
        return num & ~(1<<bit);
    }

    public static void isPowerOfTwo(int num){
        if ((num & num-1) == 0){
            System.out.println("Number is power of 2");
        }
        else {
            System.out.println("Number is not a power of 2");
        }
    }

    public static int unSetRightMostSetBit(int num){
        return (num & num-1);
    }

    public static void NoOfSetBits(int num){
        int count = 0;
        while (num != 0 ){
            count++;
            num = unSetRightMostSetBit(num);
        }
        System.out.println(count);
    }

}
