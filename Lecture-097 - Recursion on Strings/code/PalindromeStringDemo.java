public class PalindromeStringDemo {
    private boolean checkPalindrome(String str, int i, int j){
        // base case
        if(i>=j) return true;
        if(str.charAt(i)!=str.charAt(j)) return false;
        return checkPalindrome(str, i+1,j-1);
    }
    public static void main(String[] args) {
        String str = "SHASHWAT";
        PalindromeStringDemo pd = new PalindromeStringDemo();
        boolean res = pd.checkPalindrome(str, 0, str.length()-1);
        System.out.println("Is " + str + " palindrome ? => " + res);
    }
}

