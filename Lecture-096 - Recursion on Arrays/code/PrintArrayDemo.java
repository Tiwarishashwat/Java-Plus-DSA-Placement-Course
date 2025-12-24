public class PrintArrayDemo {
    private void printArray(int index, int arr[]){
        //base case
        if(index == arr.length) return;
        System.out.print(arr[index] + " ");
        printArray(index+1,arr);
    }
    private void printReverseArray(int index, int arr[]){
        //base case
        if(index == arr.length) return;
        printReverseArray(index+1,arr);
        System.out.print(arr[index] + " ");
    }
    public static void main(String[] args) {
        int arr[] = {7,6,1,4,5,8,0,2};
        PrintArrayDemo pd = new PrintArrayDemo();
        pd.printArray(0, arr);
        System.out.println("\n Reverse array is: ");
        pd.printReverseArray(0,arr);
    }
}
