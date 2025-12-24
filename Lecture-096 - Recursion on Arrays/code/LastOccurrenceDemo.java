public class LastOccurrenceDemo {
    private int lastOccurrence(int arr[], int index, int target){
        //base case
        if(index == arr.length) return -1;
        int res = lastOccurrence(arr,index+1,target);
        if(res==-1){
            if(arr[index] == target) return index;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {7,4,1,4,5,8,4,2};
        int target = 11;
        LastOccurrenceDemo fo = new LastOccurrenceDemo();
        int res = fo.lastOccurrence(arr, 0, target);
        if(res == -1){
            System.out.println(target + " is not present in array.");
        }else{
            System.out.println("Last occurrence of " + target + " in array is: "+ res);
        }

    }
}
