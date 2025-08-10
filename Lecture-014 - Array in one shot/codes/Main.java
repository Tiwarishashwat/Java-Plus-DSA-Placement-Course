//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //declare
        int arr[] = new int[5];
        //default value is zero
        System.out.println("before: value at 0 th index -> " + arr[0]);
        //insert
        arr[0] = 10;
        System.out.println("after insert: value at 0 th index -> " + arr[0]);

        //update
        arr[0] = 7;
        System.out.println("after update: value at 0 th index -> " + arr[0]);

        //delete
        //soft delete
        arr[0] = 0;
        System.out.println("after delete: value at 0 th index -> " + arr[0]);

        //traverse
        int len = arr.length;
        arr[0] = 10;
        arr[1] = 5;
        arr[4] = 6;
        System.out.println("len id array is: " + len);
        for(int index=0;index<len;index++){
            System.out.println("Element at index " + index + " is " + arr[index]);
        }

    }
}













