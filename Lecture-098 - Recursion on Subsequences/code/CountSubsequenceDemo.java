public class CountSubsequenceDemo {
    private int countSubsequences(String input, int index, String current){
        // base case
        if(index == input.length()){
//            System.out.print(current + " ,");
            return 1;
        }
        //ab
        //pick case
        int pick = countSubsequences(input,index+1,current + input.charAt(index)); //abc

        //ab
        //no pick case
        int noPick = countSubsequences(input,index+1,current);

        return pick + noPick;

    }

    private int countSubsequencesStartingWithA(String input, int index, String current){
        // base case
        if(index == input.length()){
            if(current.startsWith("a")){
                return 1;
            }
//            System.out.print(current + " ,");
            return 0;
        }
        //ab
        //pick case
        int pick = countSubsequencesStartingWithA(input,index+1,current + input.charAt(index)); //abc

        //ab
        //no pick case
        int noPick = countSubsequencesStartingWithA(input,index+1,current);

        return pick + noPick;

    }
    
    public static void main(String[] args) {
        String input = "abc";
        CountSubsequenceDemo pd = new CountSubsequenceDemo();
        int res = pd.countSubsequences(input, 0, "");
        System.out.println("Count is : "+ res);

        int res1 = pd.countSubsequencesStartingWithA(input, 0, "");
        System.out.println("Count of subsequence starting with A is : "+ res1);
    }
}
