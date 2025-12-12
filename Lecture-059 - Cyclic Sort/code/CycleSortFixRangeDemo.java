public class CycleSortFixRangeDemo {
    // size of array is N & elements will be in range (1 to N) [both inclusive]
    private int[] cycleSortOnFixedRange(int arr[], int N){
        int i=0;
        int n = arr.length;
        while(i<n){
            int expectedIndex = arr[i]-1;
            if(expectedIndex<0 || expectedIndex>=n || arr[expectedIndex] == arr[i]){
                i++;
            }else{
                swap(arr, expectedIndex,i);
            }
        }
        return arr;
    }
    private void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 1, 10, -2};
        CycleSortFixRangeDemo cs = new CycleSortFixRangeDemo();
        int res[] = cs.cycleSortOnFixedRange(arr, 10);
        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
