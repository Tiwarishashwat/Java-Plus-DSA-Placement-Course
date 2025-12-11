import java.util.ArrayList;
public class SPFDemo {
//    (num*log(log(num)))
    private ArrayList<Integer> findAllSPF(int num){
        ArrayList<Integer> res = new ArrayList<>();
        int prime[] = new int[num+1];
        for(int i=2;i<=num;i++){
            prime[i] = i;
        }
        int sqrt = (int)Math.sqrt(num);
        for(int i=2;i<=sqrt;i++){
            if(prime[i]==i){
                for(int j=i*i;j<=num;j=j+i){
                    if(prime[j] == j){
                        prime[j] = i;
                    }
                }
            }
        }
        for(int i=2;i<=num;i++){
            res.add(prime[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        SPFDemo sd = new SPFDemo();
        int num = 30;
        System.out.println("SPF from 2 to " + num);
        ArrayList<Integer> res = sd.findAllSPF(num);
        System.out.println(res);
    }
}
