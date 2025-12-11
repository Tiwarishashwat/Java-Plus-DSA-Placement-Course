import java.util.ArrayList;
public class PrimeFactorsDemo {
    private ArrayList<Integer> findUniquePrimeFactors(int num){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                res.add(i);
                while(num%i==0){
                    num = num / i;
                }
            }
        }
        if(num>1){
            res.add(num);
        }
        return res;
    }

    private ArrayList<Integer> findAllPrimeFactors(int num){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=2;i<=Math.sqrt(num);i++){
            while(num%i==0){
                res.add(i);
                num = num / i;
            }
        }
        if(num>1){
            res.add(num);
        }
        return res;
    }

    public static void main(String[] args) {
        PrimeFactorsDemo pf = new PrimeFactorsDemo();
        int num = 640;
        ArrayList<Integer> res = pf.findUniquePrimeFactors(num);
        System.out.println(res);

        ArrayList<Integer> res1 = pf.findAllPrimeFactors(num);
        System.out.println(res1);
    }
}
