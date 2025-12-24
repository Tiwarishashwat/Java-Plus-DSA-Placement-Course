public class PrintAllStringSubsequenceDemo {
    private void printSubsequences(String input, int index, String current){
       //base case
        if(index == input.length()){
            System.out.print(current + " ,");
            return;
        }
        //ab
        //pick
        printSubsequences(input, index+1, current + input.charAt(index)); //abc
        //ab
        //no pick
        printSubsequences(input, index+1, current);

    }
    public static void main(String[] args) {
        String input = "abc";
        PrintAllStringSubsequenceDemo pd = new PrintAllStringSubsequenceDemo();
        pd.printSubsequences(input, 0, "");
    }
}
