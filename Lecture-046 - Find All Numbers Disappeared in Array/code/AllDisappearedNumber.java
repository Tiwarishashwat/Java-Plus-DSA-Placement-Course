class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        cycleSort(nums);
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                list.add(i+1);
            }
        }
        return list;
        
    }
    public void cycleSort(int nums[]){
        int n = nums.length;
        int index = 0;
        while(index<n){
            int element = nums[index];
            int correctPos = element-1;
            if(nums[index]!=nums[correctPos]){
                swap(nums,index, correctPos);
            } else {
                index++;
            }
        }
    }
    public void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}















