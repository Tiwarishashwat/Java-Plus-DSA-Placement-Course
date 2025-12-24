public class My2dArray {
    public static void main(String[] args) {
        int matrix[][] = new int[3][2];
        int rows = matrix.length;
        int cols = matrix[0].length;
        //fill
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                matrix[r][c] = 10;
            }
        }
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }

        matrix[1][1] = 20;
        System.out.println("after update");
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }

        matrix[1][1] = 0;

        System.out.println("after delete");
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println("printing 1st row");
        int subArray[] = matrix[1];
        int len = subArray.length;
        for(int c=0;c<len;c++){
            System.out.print(subArray[c] + " ");
        }
        System.out.println();

    }
}
