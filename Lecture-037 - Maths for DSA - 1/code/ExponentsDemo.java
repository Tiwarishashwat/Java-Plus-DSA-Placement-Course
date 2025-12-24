public class ExponentsDemo {
//    O(b)
    public void findPower(int a, int b){
        boolean isNeg=false;
        if(b<0){
            b = -1 * b;
            isNeg = true;
        }
        double res=1;
        for(int i=0;i<b;i++){
            res *= a;
        }
        if(isNeg){
            res = 1/res;
        }
        System.out.println("power is: " + res);
    }

    public void fastExponentiation(int a, int b){
        boolean isNeg=false;
        if(b<0){
            isNeg = true;
            b = -1 * b;
        }
        double res=1.0;
        while (b>0){
            if(b%2!=0){
                res = res * a;
                b--;
            }
            b=b/2;
            a = a*a;
        }
        if(isNeg){
            res = 1/res;
        }
        System.out.println("res is " + res);
    }
    public static void main(String[] args) {
        ExponentsDemo ed = new ExponentsDemo();
//        ed.findPower(2,5);
        ed.fastExponentiation(2,-5);
    }
}
