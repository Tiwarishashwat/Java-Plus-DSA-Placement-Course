public class PrintStringDemo {
    private void printChars(int index, String str){
        //BASE CASE
        if(index == str.length()){
            return;
        }
        System.out.print(str.charAt(index) + " ");
        printChars(index+1, str);
    }
    public static void main(String[] args) {
        String str = "SHASHCODE";
        PrintStringDemo pd = new PrintStringDemo();
        pd.printChars(0, str);

    }
}
