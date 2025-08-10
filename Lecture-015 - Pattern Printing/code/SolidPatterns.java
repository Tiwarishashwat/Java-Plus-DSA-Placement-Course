public class SolidPatterns {
    public static void main(String[] args) {
        //square
        System.out.println("Shape: Square");
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // right triangle
        System.out.println("Shape: Right angled triangle");
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
