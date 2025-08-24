public class NumberAndCharacterPattern {
    public static void main(String[] args) {
        //numbered right-angled triangle
        System.out.println("numbered right-angled triangle");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //Character based right-angled triangle
        System.out.println("Character based right-angled triangle");
        for(int i=0;i<3;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(65+j));
            }
            System.out.println();
        }


    }
}
