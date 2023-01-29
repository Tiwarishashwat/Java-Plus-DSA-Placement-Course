import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
//        System.out.println("Hi coder");

        CalculatorApplication obj = new CalculatorApplication();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Calculator Application - By Java Plus DSA");
        // Take input from user and decide which operation to perform
       do {
           System.out.println("Choose an Operation: ( *, +, -, %, / )");
           System.out.print("->");
            String input = sc.next();
            char ch = input.charAt(0);
            if(input.length()!=1) {
                System.out.println("Wrong input, please try again");
            }else {
                obj.chooseOperation(ch);
            }
            boolean exit = obj.exitProgram();
            if(exit){
                break;
            }
       } while (true);
        System.out.println("Thanks for using our service");
    }
    public boolean exitProgram(){
        Scanner sc = new Scanner(System.in);
        int times = 0;
        int retry = 5;
        for(times = 0; times < retry; times++){
            System.out.println("Do you want to continue? (y/n)");
            String exitInput = sc.next();
            char ch1 = exitInput.charAt(0);
            if (exitInput.length()==1 && (ch1 == 'n' || ch1 == 'N')){
                return true;
            } else if (exitInput.length()==1 && (ch1 == 'y'|| ch1 == 'Y')) {
                return false;
            }else{
                System.out.println("Wrong input, please try again");
            }
        }
        if(times >= retry){
            System.out.println("Maximum retry count exceeded! Exiting forcefully");
            return true;
        }
        return false;
    }
    public int getInteger(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       return num;
    }
    public void chooseOperation(char ch){


        switch (ch){
            case '*':
                int num1 = getInteger();
                int num2 = getInteger();
                System.out.println("Multiply Result -> " + (num1*num2));
                break;
            case '+':
                int num3 = getInteger();
                int num4 = getInteger();
                System.out.println("Addition -> " + (num3+num4));
                break;
            case '-':
                int num5 = getInteger();
                int num6 = getInteger();
                System.out.println("Subtraction -> "+ (num5 - num6));
                break;
            case '/':
                int num7 = getInteger();
                int num8 = getInteger();
                if (num8 == 0){
                    System.out.println("Divide by zero error");
                    break;
                }
                System.out.println("Division -> "+ (num7/num8));
                break;
            case '%':
                int num9 = getInteger();
                int num10 = getInteger();
                if (num10 == 0){
                    System.out.println("Divide by zero error");
                    break;
                }
                System.out.println("Modulo -> "+ (num9%num10));
                break;
            default:
                System.out.println("Unknown Operation");
        }
    }
}






