public class ReplacePiInString {
    private String replacePI(String str, int index){
        //base case
        int n = str.length();
        if(index == n) return "";
        if(index<n-1 && str.charAt(index)=='P' && str.charAt(index+1)=='I'){
            return ("3.14" + replacePI(str, index+2));
        }else{
            return (str.charAt(index) + replacePI(str, index+1));
        }
    }
    public static void main(String[] args) {
        String str = "X";
        ReplacePiInString pd = new ReplacePiInString();
        String res = pd.replacePI(str, 0);
        System.out.println("updated string after replacing all PI is => " + res);
    }
}


