public class ArrayWithShifting {
    public static void main(String[] args) {
        ArrayWithShifting obj = new ArrayWithShifting();
        int arr[] = new int[4];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 7;
        arr[3] = 1;

        for(int index=0;index<4;index++){
            System.out.println("Element at index " + index + " is " + arr[index]);
        }

        obj.insertWithShift(arr,9,5);

        for(int index=0;index<4;index++){
            System.out.println("After Shift Element at index " + index + " is " + arr[index]);
        }


        obj.deleteWithShift(arr, 1);

        for(int index=0;index<4;index++){
            System.out.println("After delete Element at index " + index + " is " + arr[index]);
        }
    }

    public void insertWithShift(int arr[], int element, int index){
        int len = arr.length;
        if(index <0 || index>=len){
            System.out.println("index out of bound");
            return;
        }
        for(int i = len-2;i>=index;i--){
            arr[i+1] = arr[i];
        }
        arr[index] = element;
    }

    public void deleteWithShift(int arr[], int index){
        int len = arr.length;
        if(index <0 || index>=len){
            System.out.println("index out of bound");
            return;
        }
        for(int i = index+1;i<len;i++){
            arr[i-1] = arr[i];
        }
        arr[len-1] = 0; //delete, to avoid duplicate
    }
}






