class Solution {
    public int findDuplicate(int[] nums) {
        int arr[] = nums;
        for(int i=0;i<arr.length;i++){
            int element = Math.abs(arr[i]);
            int actualIndex = element-1;
            if(arr[actualIndex]<0){
                return element;
            }
           arr[actualIndex] = -1*arr[actualIndex];
        }
       
        return -1;
    }
 public List<Integer> findDuplicates(int[] nums) {
         int arr[] = nums;
          List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++){
            int element = Math.abs(arr[i]);
            int actualIndex = element-1;
            if(arr[actualIndex]<0){
                 list.add(element);
            }
           arr[actualIndex] = -1*arr[actualIndex];
        }
        return list;
  
    }
}