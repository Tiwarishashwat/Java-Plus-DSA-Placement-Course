public class ReverseString{
public static void main(String[] args) {
        reverseString("ABCDEF");
        reverseString2("ABCDEF");
        reverseString3("ABCDEF");       
    }
 public static void reverseString(String input){
        // 1st method
        String ans = "";
        for(int i=0;i<input.length();i++){
            ans = input.charAt(i) + ans;
        }
        System.out.println(ans);
    }

    public static void reverseString2(String input){
        // 2nd method
        StringBuilder ans = new StringBuilder(input);
        int n = ans.length();
//        String ans = "";
        for(int i=0;i<n/2;i++){
          char firstChar = ans.charAt(i);
          char lastChar = ans.charAt(n-1-i);
          ans.setCharAt(i,lastChar);
            ans.setCharAt(n-1-i,firstChar);
        }
        System.out.println(ans.toString());
    }

    public static void reverseString3(String input){
        // 3rd method
//        StringBuilder ans = new StringBuilder(input);
        char ansArr[] = input.toCharArray();
        int n = ansArr.length;
//        String ans = "";
        for(int i=0;i<n/2;i++){
            char firstChar = ansArr[i];
            char lastChar = ansArr[n-1-i];
            ansArr[i] = lastChar;
            ansArr[n-1-i] = firstChar;
        }
        for(int i=0;i<n;i++){
            System.out.print(ansArr[i]);
        }
    }
}