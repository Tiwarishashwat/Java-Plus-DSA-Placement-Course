class MyCode {
    static int cop = 30;
    int poc = 20;
    public static void main(String[] args) {
        int a = 25;
        // int a =45;
        byte b = 25;
        long x = 38;
        short y = 789;
        short z = (short) 32769;
        // System.out.println(z);

        float f = 98.9F;
        float F = 54.6f;

        int first = 32;
        int second = 045;
        int third = 0X17AB;
        int fourth = 0b0101;
        
        // System.out.println(first);
        // System.out.println(second);
        // System.out.println(third);
        // System.out.println(fourth);

        char ch = 'a';

        char ch1 = 062; //2 octcal
        char ch2 = 62; //> decimal
        char ch3 = 0x12A; //? hexa

        char ch4 = '\u0061';
        char ch5 = '\n';

        // System.out.println(ch);
        // System.out.println(ch1);
        // System.out.println(ch2);
        // System.out.println(ch3);
        // System.out.println(ch4);

        // System.out.println("s\nh\ba\ry");

        // mixed mode operations.

        // System.out.println(10 + 30 + "My name is "+"SHASHWAT" +10 + 40);


        // byte bv = (byte)258;

        // System.out.println(bv);


        // int ans = (int)(10 + 30 + 52.8);

        // final int xyz; // declare
        // xyz = 56789; // initialize
        // final int regNo = 45679;

        // System.out.println(regNo);

        int local = 30;
        // System.out.println(local);

        // System.out.println(poc);

        MyCode obj1 = new MyCode();
        obj1.poc = 30;
        // obj1.cop = 58;
        MyCode.cop = 58;
        // System.out.println(obj1.poc);
        System.out.println(obj1.cop);

        MyCode obj2 = new MyCode();
        System.out.println(obj2.cop);
        // System.out.println(obj2.poc);
        // obj1.poc

        // System.out.println(cop);

        // char ch11 = '\u0061'; A
        // char ch12 = '\u0062'; M
        // char ch13 = '\u0062'; A
        // char ch14 = '\u0062'; N

        // System.out.println(ch11+ch12.....);

        // regNo = 4567890;/

    }
    void myFun() {
        // System.out.println(local);
        System.out.println(poc);
        System.out.println(cop);
    }

}














