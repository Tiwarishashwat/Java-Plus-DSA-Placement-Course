public class PrintSelectiveSubsequenceDemo {
    private void printSubsequencesStartingWithA(String input, int index, String current){
        // base case
        if(index == input.length()){
            if(current.startsWith("a")){
                System.out.print(current + " ,");
            }
            return;
        }
        //ab
        //pick case
        printSubsequencesStartingWithA(input,index+1,current + input.charAt(index)); //abc

        //ab
        //no pick case
        printSubsequencesStartingWithA(input,index+1,current);

    }
    public static void main(String[] args) {
        String input = "abc";
        PrintSelectiveSubsequenceDemo pd = new PrintSelectiveSubsequenceDemo();
        pd.printSubsequencesStartingWithA(input, 0, "");
    }
}
