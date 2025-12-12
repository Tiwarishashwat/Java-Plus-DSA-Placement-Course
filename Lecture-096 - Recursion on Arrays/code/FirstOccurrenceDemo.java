public class FirstOccurrenceDemo {
    private int firstOccurrence(int arr[], int index, int target){
        //base case
        if(index == arr.length) return -1;
        if(arr[index] == target) return index;
        return firstOccurrence(arr,index+1, target);
    }
    public static void main(String[] args) {
        int arr[] = {7,4,1,4,5,8,4,2};
        int target = 11;
        FirstOccurrenceDemo fo = new FirstOccurrenceDemo();
        int res = fo.firstOccurrence(arr, 0, target);
        if(res == -1){
            System.out.println(target + " is not present in array.");
        }else{
            System.out.println("First occurrence of " + target + " in array is: "+ res);
        }

    }
}
