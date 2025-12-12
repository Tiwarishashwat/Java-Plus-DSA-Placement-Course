public class CycleSortDemo {
    private int[] cycleSort(int arr[]) {
        int n = arr.length;
//        N^2
        for (int cycle = 0; cycle < n - 1; cycle++) {
            int element = arr[cycle];
            int pos = cycle;

            // Find position where we put the element
            for (int i = cycle + 1; i < n; i++) {
                if (arr[i] < element) {
                    pos++;
                }
            }

            // If element is already in correct place
            if (pos == cycle) continue;

            // Skip duplicates
            while (element == arr[pos]) {
                pos++;
            }

            // Put the element to its right position
            if (pos != cycle) {
                int temp = arr[pos];
                arr[pos] = element;
                element = temp;
            }

            // Rotate rest of the cycle
            while (pos != cycle) {
                pos = cycle;

                for (int i = cycle + 1; i < n; i++) {
                    if (arr[i] < element) {
                        pos++;
                    }
                }

                while (element == arr[pos]) {
                    pos++;
                }

                int temp = arr[pos];
                arr[pos] = element;
                element = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {10, 15, 10, 10, 19, 18, 16, 20};
        CycleSortDemo cs = new CycleSortDemo();
        int res[] = cs.cycleSort(arr);
        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
