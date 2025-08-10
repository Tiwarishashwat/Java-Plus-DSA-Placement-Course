class MyFunctionClass{
    public void printName(String name){
        System.out.println("name is -> " + name);

    }
    public int multiply(int a, int b){
        int res = a*b;
        return res;
    }

    public void swap(int a, int b){
        System.out.println("before swap: a: " + a +" , b: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swap: a: " + a +" , b: " + b);
    }

    public void increment(int val){
        val = val + 10;
        System.out.println("new value is " + val);
    }
}

class MySecondClass{
    public static void main(String[] args) {
        MyFunctionClass obj = new MyFunctionClass();
        // obj.printName("Shashwat");
        // int result = obj.multiply(5,7);
        // System.out.println(result);
        // int a = 5;
        // int b = 7;
        // obj.swap(a, b);
        // System.out.println("outside swap: a: " + a +" , b: " + b);

        int val = 10;
        obj.increment(val);

        System.out.println("outside increment: val: " + val);
        
    }
}