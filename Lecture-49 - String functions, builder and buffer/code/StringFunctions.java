public class StringFunctions {
 public static void main(String[] args) {
   //string functions
         String str = "Tshashwat TTiwarI";
        str = str.toLowerCase();
        System.out.println(str.toLowerCase());
        System.out.println(str);

        System.out.println(str.toUpperCase());

        System.out.println(str.charAt(0));

        System.out.println(str.indexOf('T'));
        System.out.println(str.lastIndexOf('T'));
        System.out.println(str.length());
        char ch[] = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i] + " ");
        }

        System.out.println("SHASHWAT".compareTo("SHASH"));
        System.out.println("SHASH".compareTo("SHASHWAT"));
        System.out.println("SHASHWAT".compareTo("SHASHWAT"));
        System.out.println("SHASH".compareTo("AMASH"));

        System.out.println("    shSHWYUWF     ");
        System.out.println("    shSHWYUWF     ".trim());
        System.out.println("shashwat tiwari".startsWith("Rshashwat "));
        System.out.println("shashwat tiwari".endsWith("ri"));


        System.out.println("shashwat".substring(3,3));



        String myLocations = "hyderabad, chennai, bangalore, noida, pune";

        String myLocationList[] = myLocations.split(",");

       for(int i=0;i<myLocationList.length;i++){
            System.out.print(myLocationList[i] + " ");
       }

        String email1 = "Shahwattiwari8@gmail.com";
       String email2 = "randomAvenger@hotmail.com";

       String emailArr[] = email1.split("@");
       String lastPart = emailArr[emailArr.length-1];
       int dotIndex = lastPart.lastIndexOf('.');
       System.out.println(lastPart.substring(0,dotIndex));

       StringBuilder name1 = new StringBuilder("shashwat");
        StringBuilder name2 = new StringBuilder("shashwat");
        StringBuilder name3 = new StringBuilder("shashwat");
        StringBuilder name4 = name1;

        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
        System.out.println(name3 == name4);
        System.out.println(name4 == name2);
        System.out.println(name1 == name4);


        name4.append("tiwari");

        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
        System.out.println(name3 == name4);
        System.out.println(name4 == name2);
        System.out.println(name1 == name4); 
}
}