
public class ArmstrongDemo {
//    logNum base 10 * log(digits)
    public boolean isArmstrong(int num){
        if(num<0) return false;
       int res =0;
       int copy = num;
       int digits = (int)Math.log10(num) + 1;
       while(num>0){
           int digit = num % 10;
           res = res + (int)Math.pow(digit,digits);
           num = num / 10;
       }
       return (copy == res);
    }
    public static void main(String[] args) {
        ArmstrongDemo ad = new ArmstrongDemo();
        int num = 12;
        System.out.println("is " + num + " armstrong? -> " + ad.isArmstrong(num));
    }
}
