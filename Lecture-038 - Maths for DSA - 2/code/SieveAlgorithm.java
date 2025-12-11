import java.util.Arrays;

public class SieveAlgorithm {
    public void printPrimes(int num){
        boolean arr[] = new boolean[num+1];
        Arrays.fill(arr,true);
        arr[0] = false;
        arr[1] = false;
        int sqrt = (int)Math.sqrt(num);
//
        for(int i=2;i<=sqrt;i++){
            if(arr[i]){
                //num/i
                for(int j=i*i;j<=num;j=j+i){
                    arr[j] = false;
                }
            }
        }

        for(int i=2;i<=num;i++){
            if(arr[i]){
                System.out.print(i + " ");
            }
        }

    }
    public static void main(String[] args) {
        SieveAlgorithm sa = new SieveAlgorithm();
        int num = 19;
        sa.printPrimes(num);
    }
}
