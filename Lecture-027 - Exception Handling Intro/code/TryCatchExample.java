import java.util.Scanner;

public class TryCatchExample {
    //Example of Runtime Exception / unchecked exception
    public int getUserInput(){
        Scanner sc = new Scanner(System.in);
        int val=0;
        try{
            val=sc.nextInt();
        }catch (Exception e){
            System.out.println("failed: " + e);
        }
        return val;
    }
    public static void main(String[] args) {
        TryCatchExample t = new TryCatchExample();
        System.out.println("Insert a number");
        int val = t.getUserInput();
        System.out.println("Inserted value: " + val);
    }
}















//public int getUserInput(){
//    Scanner sc = new Scanner(System.in);
//    int val=0;
//    try{
//        val = sc.nextInt();
//    }catch (Exception e){
//        System.out.println("exception: " + e);
//    }
//    return val;
//}
