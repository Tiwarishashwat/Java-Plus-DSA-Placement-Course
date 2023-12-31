class Temp {
    private int myVar1 = 0;
    int myVar2 = 20;

    public int getMyVar1() {
        return myVar1;
    }

    public void setMyVar1(int myVar1) {
        this.myVar1 = myVar1;
    }
}

class MyFunc {
    public static void main(String[] args) {

        MyFunc mf = new MyFunc();

        Temp obj1 = new Temp();
        Temp obj2 = new Temp();

        obj1.myVar2 = 10;
        obj1.setMyVar1(10);

        int val = obj1.getMyVar1();

        obj2.myVar2 = 20;
        mf.swapByReference(obj1, obj2);
        System.out.println( "After call "+ obj1.myVar2 + "," + obj2.myVar2);
        // obj.myVar;

        int num1 = 10;
        int num2 = 20;
        long num3 = 10;
        long num4 = 20;
        mf.swap(num1, num2);
        mf.swap(num3, num4);
        mf.swap(num3, num1);
        mf.swap(num1, num2);




        // mf.swap(obj.myVar1, obj.myVar2);
        // System.out.println(obj.myVar1 + "," + obj.myVar2);
        // mf.calculateArea(2, 5);
        // System.out.println(res);
        
    }

    public void swapByReference(Temp obj1, Temp obj2) {
        System.out.println("first: " + obj1.myVar2 + "," + obj2.myVar2);
        obj1 = new Temp();
        obj1.myVar2 = 10;

        obj2 = new Temp();
        obj2.myVar2 = 20;

        System.out.println("second: " + obj1.myVar2 + "," + obj2.myVar2);

        int temp = obj1.myVar2;
        obj1.myVar2 = obj2.myVar2;
        obj2.myVar2 = temp;
        System.out.println(obj1.myVar2 + "," + obj2.myVar2);
    }

    public void swap(int val1, int val2) {
        System.out.println("A: "+ val1 + "," + val2);
        int temp = val1;
        val1 = val2;
        val2 = temp;
        System.out.println(val1 + "," + val2);
    }

    public void swap(long val1, long val2) {
        System.out.println("B: "+ val1 + "," + val2);
        long temp = val1;
        val1 = val2;
        val2 = temp;
        System.out.println(val1 + "," + val2);
    }

    public void swap(long val1, int val2) {
        System.out.println("C: "+ val1 + "," + val2);
        long temp = val1;
        val1 = val2;
        val2 = (int)temp;
        System.out.println(val1 + "," + val2);
    }

    public void swap(int val1, long val2) {
        System.out.println("E: "+ val1 + "," + val2);
        long temp = val1;
        val1 = (int)val2;
        val2 = temp;
        System.out.println(val1 + "," + val2);
    }

    public void swap() {
        System.out.println("D: "+ "Jada ho rha hai");
    }



    public void calculateArea(int length, int width){
        
        int area = length * width;
        // System.out.println(length * width);
        System.out.println(area);
        return;
    }
    
}