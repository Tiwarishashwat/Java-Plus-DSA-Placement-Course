class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length){
            return -1;
        }
        int start=0;
        int end=0;
        for(int a : arr){
            start = Math.max(start,a);
            end += a;
        }
        int ans=-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isAllocationPossible(arr, mid, k)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    private boolean isAllocationPossible(int arr[], int maxPages, int students){
        int studentCount=1;
        int pages=0;
       for(int a: arr){
           pages += a;
           if(pages>maxPages){
               pages=a;
               studentCount++;
           }
           if(studentCount>students){
               return false;
           }
       }
       return true;
    }
}