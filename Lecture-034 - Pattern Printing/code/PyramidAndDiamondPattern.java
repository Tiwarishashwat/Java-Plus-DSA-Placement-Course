public class PyramidAndDiamondPattern {
    public static void main(String[] args) {
        // centered pyramid
        System.out.println("Centered Pyramid");
        for(int i=1;i<=4;i++){
            //spaces
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // diamond pyramid
        System.out.println("Diamond Pyramid");
        for(int i=1;i<=4;i++){
            //spaces
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=3;i>=1;i--){
            //spaces
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
