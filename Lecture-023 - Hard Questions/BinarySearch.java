public class BinarySearch{
    public static void main(String[] args) {
        int books[] = {12,34,67,90};
        bookAllocation(books,2);
    }

    public static int bookAllocation(int books[], int students){
        if(books.length < students)
        {
            return -1;
        }
        // range will be max of array and sum of array..
        int start = Integer.MIN_VALUE; // for finding max element
        int end = 0; // sum of array.

        for(int i=0;i<books.length;i++){
            if(books[i]>start){
                start = books[i];
            }
            end = end + books[i];
        }
        int res = -1;

        while(start<=end){
            // max pages that can be allocated to single student.
            int mid = start + (end-start)/2;
            // if allocation is possible then minimize the number of pages
            if(isAllocationPossible(books,mid,students)){
                res = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return res;
    }

    static boolean isAllocationPossible(int books[], int maxPages, int students){
        int currentStudent = 1;
        int pages = 0;
        for(int i=0;i<books.length;i++){
            pages += books[i];
            // if pages exceed maxPages
            if(pages>maxPages){
                // allocate to next student
                currentStudent+=1;
                pages = books[i];
            }
            if(currentStudent > students) {
                return false;
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        // range will be max of array and sum of array..
        int start = Integer.MIN_VALUE; // for finding max element
        int end = 0; // sum of array.

        for(int i=0;i<weights.length;i++){
            if(weights[i]>start){
                start = weights[i];
            }
            end = end + weights[i];
        }
        int res = -1;

        while(start<=end){
            // max capacity that can be shipped int one day.
            int mid = start + (end-start)/2;
            // if shipment is possible then minimize the capacity
            if(isShipmentPossible(weights,mid,days)){
                res = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return res;
    }

    static boolean isShipmentPossible(int weights[], int maxCapacity, int days){
        int currentDay = 1;
        int capacity = 0;
        for(int i=0;i<weights.length;i++){
            capacity += weights[i];
            // if capacity exceed maxCapacity
            if(capacity>maxCapacity){
                // ship on the next day
                currentDay+=1;
                capacity = weights[i];
            }
            if(currentDay > days) {
                return false;
            }
        }
        return true;
    }
}












