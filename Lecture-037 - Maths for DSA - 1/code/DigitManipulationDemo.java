public class DigitManipulationDemo {
    public void findDigitsUsingFormula(int num){
        if(num == 0){
            System.out.println("Number of digits: " + 1);
            return;
        }
        if(num<0){
            num = -1 * num;
        }
        int res = (int)Math.log10(num) + 1;
        System.out.println("Number of digits: " + res);
    }
    //  log num base 10
    public void findDigitsUsingDivision(int num){

        if(num == 0){
            System.out.println("Number of digits: " + 1);
            return;
        }
        if(num<0){
            num = -1 * num;
        }
        int res=0;
        while (num>0){
            num = num / 10; // num/=10
            res++;
        }
        System.out.println("Number of digits: " + res);
    }

    public void appendDigit(int num, int digit){
        boolean isNeg=false;
        if(num<0){
            isNeg = true;
            num = -1*num;
        }
        int res = num *10 + digit;
        if(isNeg){
            res = -1* res;
        }
        System.out.println("new number is: " + res);
    }

    public void insertAtFront(int num, int digit){
        boolean isNeg = false;
        if(num < 0){
            num = -1 * num;
            isNeg = true;
        }
        int digits = 1; // when num is 0
        if(num>0){
            digits = (int)Math.log10(num) + 1;
        }
        int res = digit * (int)Math.pow(10,digits) + num;
        if(isNeg){
            res = -1 * res;
        }
        System.out.println("New number is: " + res);
    }

    public void reverse(int num){
        if(num == 0){
            System.out.println("Reversed number is: " + 0);
            return;
        }
        int res=0;
        boolean isNeg=false;
        if(num<0){
            isNeg = true;
            num = -1 * num;
        }
        while (num>0){
            int d = num %10;
            res = res *10 + d;
            num = num/10;
        }
        if(isNeg){
            res = -1 * res;
        }
        System.out.println("Reversed number is: " + res);
    }


    public static void main(String[] args) {
        DigitManipulationDemo dm = new DigitManipulationDemo();
//        dm.findDigitsUsingFormula(0);
//        dm.findDigitsUsingDivision(0);

//        dm.appendDigit(0,7);
//        dm.insertAtFront(0,3);
//        dm.reverse(0);
    }
}
