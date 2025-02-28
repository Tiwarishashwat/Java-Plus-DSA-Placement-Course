//         decimalno,base
//         power=0 ans=0
//         while(decimal_no>0){
//            int rem=decimal_no%base;
//            decimal_no=decimal_no/base;
//            ans+=rem*Math.pow(10,power);
//            power++;
//         }
//     }
    
    
//     a,b
//     while(b>0){
//         if(b%2!=0){
//             res=res*a;
//         }
//         b=b/2;
//         a=a*a;
//     }
// }

// 2,5
// res=2
// b=2
// a=4
// b=1
// a=16
// res=32
// a=16*16
// final-------------------res=32

public class MathsForDSA {
    public static void main(String[] args) {
            decimalToAnyBase(5,2);
            AnyBaseToDecimal(101,2);
            fastExponentiation(2,3);
            findEvenOdd(7);
            reverseNum(20461);
            power(10,6);
    }
    static void decimalToAnyBase(int decimalNum, int base) {
        int resNum = 0;
        int power = 0;
        while (decimalNum>0){
            int rem = decimalNum%base;
            decimalNum /= base;
            resNum += rem * power(10,power);
            power++;
        }
        System.out.println("Result is "+ resNum);
    }
    static void AnyBaseToDecimal(int binaryNum, int base) {
        int resNum = 0;
        int power = 0;
        while (binaryNum>0){
            int unitDigit = binaryNum %10;
            binaryNum /=10;
            resNum += unitDigit * power(base,power);
            power++;
        }
        System.out.println("Result is "+ resNum);
    }
    static void findEvenOdd(int num){
        if(num%2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    static void reverseNum(int num){

        int revNum = 0;
        while (num > 0 ){
            int digit = num %10;
            revNum = revNum*10 + digit;
            num /=10;
        }
        System.out.println("Reverse is: "+ revNum);

    }
    static double power(int num, int power){
        double res = 1;
        for(int i = 0; i< power;i++){
            res = res*num;
        }
        System.out.println(res);
        return res;
    }

    static double fastExponentiation(int num, int power){
        double res = 1;
        while (power > 0){
            if(power %2!=0){
                res = res *num;
            }
            power /= 2;
            num = num *num;
        }
        System.out.println(res);
        return res;
    }


}




