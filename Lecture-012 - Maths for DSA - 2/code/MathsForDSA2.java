import java.util.Arrays;

public class MathsForDSA2 {
    public static void main(String[] args) {
        countDigits(78);
        countDigitsViaLog(1456);
        armstrongNumber(121);
        printAllDivisors(36);
        primeNumbers(25);
        sieveAlgorithm(40);
        GCD(24,36);
        euclideanGcd(24,36);
        efficientEuclideanGcd(24,36);
        lcm(24,36);
        fastExponentiation(1234567,5, 1000000007) ;
        factorial(5);
        findTrailingZerosInFactorial(30);
    }


    public static void countDigits(int num){
        if(num==0){
            System.out.println("Digits are : 1");
            return;
        }
        int counter=0;

        while (num>0){
            num/=10;
            counter++;
        }
        System.out.println("Digits are :"+ counter);
    }
    public static void countDigitsViaLog(int num){
        if(num==0){
            System.out.println("Digits are : 1");
            return;
        }
//        int count = (int)((int)Math.log(num) / Math.log(10))+1;
        int count = (int)Math.log10(num) + 1;
        System.out.println("Digits are :"+ count);
    }
    public static void armstrongNumber(int num){
        int res = 0;
        int copy = num;
        while (num>0){
            int digit = num%10;
            res = res + (int)Math.pow(digit,3);
            num /= 10;
        }
           System.out.println(res==copy);

    }
    public static void printAllDivisors(int num){
        int counter = 1;
        int sqroot = (int)newtonRaphsonSqRoot(num);
        while(counter <= sqroot){
            if(num%counter == 0){
                System.out.println(counter + "is a divisor of "+ num);
                int otherNumber = num/counter;
                if(otherNumber!=counter)
                    System.out.println(otherNumber + "is a divisor of "+ num);
            }
            counter++;
        }
    }
    public static void primeNumbers(int num){
        int counter = 2;
        int sqroot = (int)Math.sqrt(num);
        while(counter <= sqroot){
            if(num%counter == 0){
                System.out.println(num + " is not a prime number ");
                return;
            }
            counter++;
        }
        System.out.println(num + " is a prime number ");
    }
    public static void sieveAlgorithm(int num){
        boolean arr[] = new boolean[num+1];
        Arrays.fill(arr, true);
        int counter = 2;
        while (counter<=num){
            if(arr[counter] == true){
                for(int factor = counter+counter; factor<=num; factor+=counter){
                    arr[factor] = false;
                }
            }
            counter++;
        }

        for(int i=2;i<=num;i++){
            System.out.println(i +" : "+ arr[i]);
        }
    }
    public static double newtonRaphsonSqRoot(int num){
        double tol = 0.0001;
        double root;
        double X = num;
        while(true){
            root = 0.5 * (X + (num/X));
            double ans = X - root;
            if(ans < tol){
                break;
            }
            X = root;
        }
        return root;
    }
    public static void GCD(int num1, int num2){
        int min = (num1<=num2)?num1:num2;
        while (min > 0 ){
            if(num1%min == 0 && num2%min==0){
                System.out.println("GCD is:"+ min);
                return;
            }
            min--;
        }
        int max = (num1<=num2)?num2:num1;
        System.out.println("GCD is:"+ max);
    }

    public static void euclideanGcd(int num1, int num2){
        while (num1!=0 && num2!=0){
            if(num1>num2){
                num1 -=num2;
            }
            else {
                num2 -= num1;
            }
        }
        int res = num1;
        if(num1 == 0){
            res = num2;
        }
        System.out.println("GCD is "+ res);
    }
    public static int efficientEuclideanGcd(int num1, int num2){
        while (num1!=0 && num2!=0){
            if(num1>num2){
                num1 %=num2;
            }
            else {
                num2 %= num1;
            }
        }
        int res = num1;
        if(num1 == 0){
            res = num2;
        }
//        System.out.println("GCD is "+ res);
        return res;
    }

    public static void lcm(int num1, int num2){
        int res = (num1*num2)/efficientEuclideanGcd(num1,num2);
        System.out.println("Lcm is :"+ res);
    }
    static double fastExponentiation(long num, long power, long limit){
        double res = 1;
        while (power > 0){
            if(power %2!=0){
                res = (res * (num %limit))%limit;
//                res = res*num;
            }
            power /= 2;
            num = ((num%limit) * (num%limit))%limit;
//            num = num*num;
        }

        System.out.println(res);
        return res;
    }

    static void factorial(int num){
        double res = 1;
        while (num>1){
            res *= num;
            num--;
        }
        System.out.println(res);
    }

    static void findTrailingZerosInFactorial(int num){
        double res = 0;
        for(int i = 5;i<=num;i=i*i){
            res = res + Math.floor(num/i);
        }
        System.out.println(res);
    }

}



