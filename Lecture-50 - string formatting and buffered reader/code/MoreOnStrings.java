import java.util.Scanner;
public class MoreOnStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter a word");
////        String word1 = sc.next();
//        int word1 = sc.nextInt();
//        System.out.println("Enter a word please");
////        String word2 = sc.next();
//        int word2 = sc.nextInt();
//
//        System.out.println("Enter a line");
//        String line1 = sc.nextLine();
//        System.out.println("Enter next line");
//        String line2 = sc.nextLine();
//
//        System.out.print("word1:"+word1+",");
//        System.out.print("word2:"+word2+",");
//        System.out.print("line1"+line1+"*");
//        System.out.print("line2"+line2+"*");

//        System.out.println("shashwat" + 64 + 87.99 );
//
//        System.out.println("shashwat" + (64 + 87.99) );
//
//        System.out.println( 64 + 87.99 + "shashwat");
//
//        String cal =  64 + 87.99 + "shashwat";
//        String name = "shashwat";
//        int rollNumber = 37;
//        System.out.println("My name is " +      name + " My roll number is " + rollNumber);

        // string formatting.
        double num = 67.86789765;
        double newNum = num*100;
//        System.out.println(num);
//        System.out.printf("Number is %.2f",num);
        String address = "India";
        String name = String.format("Number is %f address is %s",address,num);
        System.out.println(name);



    }
}










