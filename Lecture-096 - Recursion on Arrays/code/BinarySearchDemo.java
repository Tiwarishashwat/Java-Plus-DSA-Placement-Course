public class BinarySearchDemo {
    private boolean binarySearch(int start, int end, int target, int arr[]){
        //base case
        if(start>end) return false;
        int mid = start + (end-start)/2;
        if(arr[mid] == target) return true;
        if(target < arr[mid]){
            return binarySearch(start,mid-1,target,arr);
        }else{
            return binarySearch(mid+1,end,target,arr);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,2,3,4,5,8,10,10};
        int target = 2;
        BinarySearchDemo fo = new BinarySearchDemo();
        boolean res = fo.binarySearch(0,arr.length-1, target, arr);
        System.out.println("Is " + target + " present in array: "+ res);
    }
}
