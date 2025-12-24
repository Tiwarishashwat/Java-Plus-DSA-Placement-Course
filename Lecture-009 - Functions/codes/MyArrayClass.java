public class MyArrayClass {
      public void increment(int arr[]){
    System.out.println("before increment val: " + arr[0]);
        arr[0] =  arr[0] + 10;
    System.out.println("after increment val: " + arr[0]);
    }
}

class NewCaller {
    public static void main(String[] args) {
        MyArrayClass obj = new MyArrayClass();
        int arr[] = new int[1];
        arr[0] = 10;
         System.out.println("before calling increment val: " + arr[0]);
        obj.increment(arr);
         System.out.println("after calling increment val: " + arr[0]);
    }
}


