import java.util.ArrayList;
import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {

//        int rollNo[] = new int[5];
////        int age[];
////        age = new int[7];
//        int dummy[] = {2,6,7,9,2,13,2};
//
//        rollNo[0] = 54;
        Scanner sc = new Scanner(System.in);
//
//        for(int i=0;i<3;i++){
//            System.out.println("Enter "+i+" element: ");
//            int element = sc.nextInt();
//            rollNo[i] = element;
//        }
//
//        printArray(rollNo);
//        insert(rollNo, 1,22);
//        printArray(rollNo);
//        delete(rollNo,1);
//        printArray(rollNo);

        int my2dArray[][] = new int[3][];
        int customSize = 4;
        for (int i=0;i<my2dArray.length;i++)
        {
            my2dArray[i] = new int[customSize];
            for (int j=0; j < my2dArray[i].length;j++){
                System.out.println("Enter "+j+" element: ");
                int element = sc.nextInt();
                my2dArray[i][j] = element;
            }
            customSize --;
        }

        print2dArray(my2dArray);
//        insert2dArray(my2dArray,0,0,5);
//        print2dArray(my2dArray);
//        delete2dArray(my2dArray,0,0);
//        print2dArray(my2dArray);
//        update2dArray(my2dArray,0,0,6);
//        print2dArray(my2dArray);




    }

    public static void update(int arr[], int pos, int element){
        int size = arr.length;
        if(pos<0 || pos>size-1){
            System.out.println("Wrong position");
            return;
        }
        arr[pos] = element;
    }
    public static void delete(int arr[], int pos){

        // shifting towards starting index
        for(int i = pos;i<=arr.length-2;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
    }

    public static void insert(int arr[], int pos, int element){

        int size = arr.length;
        if(pos<0 || pos>size-1){
            System.out.println("Wrong position");
            return;
        }
        // shifting towards the end
        for(int i=size-2;i>=pos;i--){
            arr[i+1] = arr[i];
        }
        arr[pos] = element;
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void print2dArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            System.out.println("For "+ i+" index");
            printArray(arr[i]);
        }
    }
    public static void insert2dArray(int arr[][], int pos1, int pos2, int element){
        insert(arr[pos1], pos2, element);
    }

    public static void delete2dArray(int arr[][], int pos1, int pos2){
        delete(arr[pos1], pos2);
    }

    public static void update2dArray(int arr[][], int pos1,int pos2, int element){
        int size1 = arr.length;
        if(pos1<0 || pos1>size1-1){
            System.out.println("Wrong position");
            return;
        }
        int size2 = arr[pos1].length;
        if(pos2<0 || pos2>size2-1){
            System.out.println("Wrong position");
            return;
        }

        arr[pos1][pos2] = element;
    }
}






