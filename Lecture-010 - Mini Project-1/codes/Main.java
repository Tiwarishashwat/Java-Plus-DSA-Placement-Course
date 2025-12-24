import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to My Calculator");

        Main obj = new Main();
        do {
            char ch =  obj.getOperator();
            if(ch == '?'){
                System.out.println("Wrong operator");
                return;
            }

            System.out.println("operator is " + ch);

            int a = obj.getOperand(1);
            int b = obj.getOperand(2);

            if(!obj.isOperandValid(ch,b)){
                System.out.println("denominator cannot be zero");
                return;
            }

            System.out.println("Entered numbers are " + a + " , " + b);

            obj.calculate(ch, a, b);

            if(obj.isExit()){
                break;
            }

        }while(true);
    }

    public boolean isExit(){
        System.out.println("Would you like to continue - Y/N ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        if(userInput.equals("Y") || userInput.equals("y")){
            return false;
        }
        return true;
    }

    public boolean isOperandValid(char operator, int num2){
        if(operator == '/' || operator == '%'){
            if(num2 == 0){
                return false;
            }
        }
        return true;
    }

    public void calculate(char op, int num1, int num2){
        switch (op){
            case '+':
                System.out.println("result is " + (num1 + num2));
                break;
            case '-':
                System.out.println("result is " + (num1 - num2));
                break;
            case '*':
                System.out.println("result is " + (num1 * num2));
                break;
            case '/':
                System.out.println("result is " + (num1 / num2));
                break;
            case '%':
                System.out.println("result is " + (num1 % num2));
                break;
        }
    }
    public boolean isOperatorValid(String userInput){
        int len = userInput.length();
        if(len==0 || len>1){
            return  false;
        }
        char ch = userInput.charAt(0);
        if(ch == '+' || ch == '-' || ch == '/' || ch == '%' || ch == '*'){
            return true;
        }
        return false;
    }

    public int getOperand(int inputNumber){
        System.out.println("Enter operand " + inputNumber);
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        return userInput;
    }


    public char getOperator(){
        System.out.println("Enter operator: ");
        System.out.println(" '+' , '-' , '/' , '%' , '*' ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        if(isOperatorValid(userInput)){
            return userInput.charAt(0);
        }else{
            return '?'; // it means wrong input
        }
    }
}