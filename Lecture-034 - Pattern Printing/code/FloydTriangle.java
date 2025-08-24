public class FloydTriangle {
    public static void main(String[] args) {
        System.out.println("Floyd's Triangle");
        int num=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }

        // pascal's triangle print! ->
    }
}
