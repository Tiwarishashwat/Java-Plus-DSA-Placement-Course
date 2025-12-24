public class RadixSortDemo {
//    TC: O( K*(N + 10 + N) + N)
//    SC : O(K *N)
    private int[] radixSort(int arr[]){
        //find max element
        int max = Integer.MIN_VALUE;
//        N
        for(int a : arr){
            max = Math.max(max,a);
        }
        //find the max number of digits
        int digits = (max==0)?1:(int)Math.log10(max)+1;
//       O( K*(N + 10 + N) + N)
        for(int d=0;d<digits;d++){
            // 403 -> (403 / 10^d 1) % 10
            // 403 -> (403 / 10 ) %10
            // 403 -> (403 / 100) % 10
            int count[] = new int[10];
            for(int a : arr){
                int digit = (a/(int)Math.pow(10,d))%10;
                count[digit]++;
            }
            for(int i=1;i<10;i++){
                count[i] += count[i-1];
            }
            int n = arr.length;
            int res[] = new int[n];
            for(int i=n-1;i>=0;i--){
                int digit = (arr[i]/(int)Math.pow(10,d))%10;
                int freq = count[digit];
                res[freq-1] = arr[i];
                count[digit]--;
            }
            arr = res;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,603,44,7,101,67};
        RadixSortDemo cs = new RadixSortDemo();
        int res[] = cs.radixSort(arr);
        for(int val : res){
            System.out.print(val + " ");
        }
    }
}
