public class JaggedArray {

    public static void main(String[] args) {
        int jagged[][] = new int[3][];
        jagged[0] = new int[3];
        jagged[1] = new int[2];
        jagged[2] = new int[4];
        int rows = jagged.length;
        for(int r=0;r<rows;r++){
            for(int c=0;c<jagged[r].length;c++){
                jagged[r][c] = 10;
            }
        }

        for(int r=0;r<rows;r++){
            for(int c=0;c<jagged[r].length;c++){
                System.out.print(jagged[r][c] + " ");
            }
            System.out.println();
        }
    }
}
