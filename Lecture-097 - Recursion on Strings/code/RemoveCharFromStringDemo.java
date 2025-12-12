public class RemoveCharFromStringDemo {
    private String removeChars(String str,char ch, int index){
        //base case
        if(index == str.length()) return "";
        String prev = removeChars(str,ch, index+1);
        if(ch == str.charAt(index)){
            return prev;
        }
        return (str.charAt(index) + prev);
    }
    public static void main(String[] args) {
        String str = "RINKI";
        char ch = 'H';
        RemoveCharFromStringDemo pd = new RemoveCharFromStringDemo();
        String res = pd.removeChars(str, ch, 0);
        System.out.println("updated string after removing all "+ ch +" is => " + res);
    }
}
