public class CountingSortDemo {
//    TC: 3N+K - > O(N+K)
//    SC: O(K)
    private int[] countSort(int arr[]){
        //1. count frequency
        int max = Integer.MIN_VALUE;
//        N
        for(int val : arr){
            max = Math.max(max,val);
        }
//        N
        int count[] = new int[max+1];
        for(int val : arr){
            count[val]++;
        }
       //2. prefix sum
//        K
        for(int i=1;i<max+1;i++){
            count[i] += count[i-1];
        }
        //3. arrange the elements
        int n = arr.length;
//        N
        int res[] = new int[n];
        for(int i=n-1;i>=0;i--){
            int val = arr[i];
            int prefixCount = count[val];
            res[prefixCount-1] = val;
            count[val]--;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {100,1,0,5,4};
        CountingSortDemo cs = new CountingSortDemo();
        int res[] = cs.countSort(arr);
        for(int val : res){
            System.out.print(val + " ");
        }
    }
}
