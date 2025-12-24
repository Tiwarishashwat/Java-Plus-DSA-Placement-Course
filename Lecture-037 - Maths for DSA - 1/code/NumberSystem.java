public class NumberSystem {
    public static void main(String[] args) {
       NumberSystem ns = new NumberSystem();
       ns.convertToDecimal("1011",2);
        ns.convertFromDecimal(107,16);
    }

    private int getDigit(char ch){
        switch (ch){
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                return ch-'0';
        }
    }

    private char getChar(int r){
        switch (r){
            case 10:
                return 'A';
            case 11:
                return 'B';
            case 12:
                return 'C';
            case 13:
                return 'D';
            case 14:
                return 'E';
            case 15:
                return 'F';
            default:
                return (char)(r+'0');
        }
    }

//    nlogn
    public void convertToDecimal(String input, int currentBase){
      int res=0;
      int pos=0;
      int len=input.length();
      for(int i=len-1;i>=0;i--){
          int digit = getDigit(input.charAt(i));
          res = res + digit * (int)Math.pow(currentBase,pos);
          pos++;
      }
      System.out.println("Converted number is: " + res);
    }
//    log input to the base destinationBase + log(input) to the base 10
    public void convertFromDecimal(int input, int destinationBase){
       StringBuilder res = new StringBuilder();
       while (input>0){
           int r = input % destinationBase;
           char ch = getChar(r);
           res.append(ch);
           input = input / destinationBase;
       }
        System.out.println("Converted number is: " + res.reverse());
    }
}
