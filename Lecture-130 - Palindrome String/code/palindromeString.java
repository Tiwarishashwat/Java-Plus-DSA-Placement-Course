public class QuestionsOnString {
    public static void main(String[] args) {
        Boolean res = checkPalindrome("NaMAn");
        System.out.println(res);
      
    }
public static boolean checkPalindrome(String input1){

        String input = input1.toLowerCase();
        int start=0;
        int end = input.length()-1;
        while(start<end){
            if(input.charAt(start) != input.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}