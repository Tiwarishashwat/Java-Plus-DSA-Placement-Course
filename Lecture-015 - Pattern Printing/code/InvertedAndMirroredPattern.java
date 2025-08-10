public class InvertedAndMirroredPattern {
    public static void main(String[] args) {
        // inverted right-angled triangle
        System.out.println("inverted right-angled triangle");
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

//        mirrored right-angled triangle
        System.out.println("mirrored right-angled triangle");
        for(int i=1;i<=4;i++){
            //spaces
            for(int j=1;j<=(4-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
