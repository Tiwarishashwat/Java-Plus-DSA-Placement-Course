public class MyReferenceClass {

    public void increment(Element e1){
    System.out.println("before increment val: " + e1.val);
        e1.val = e1.val + 10;
    System.out.println("after increment val: " + e1.val);
    }
}

class Element{
    int val;
}

class callerClass{
    public static void main(String[] args) {
        Element e1 = new Element();
        e1.val = 10;
        MyReferenceClass obj = new MyReferenceClass();
        System.out.println("before calling increment val: " + e1.val);
        obj.increment(e1);
        System.out.println("after calling increment val: " + e1.val);
    }
}