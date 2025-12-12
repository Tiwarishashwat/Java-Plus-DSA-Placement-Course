public class SearchElementInArray {
    private boolean checkElement(int arr[], int index, int target){
        //base case
        if(index == arr.length) return false;
        if(arr[index] == target) return true;
        return checkElement(arr, index+1,target);
    }
    public static void main(String[] args) {
        int arr[] = {7,6,1,4,5,8,0,2};
        int target = 2;
        SearchElementInArray pd = new SearchElementInArray();
        boolean res = pd.checkElement(arr, 0, target);
        System.out.println("Is " + target + " present in array: "+ res);
    }
}
