// User function Template for Java

class Solution {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) {
        // code here.
        int res[] = {-1,-1};
        findOccurrence(0,arr,key,res);
        return res;
        
    }
    static void findOccurrence(int index, int arr[], int key, int res[]){
        //base case
        if(index == arr.length) return;
        
        if(arr[index] == key){
            res[1] = index;
        }
        findOccurrence(index+1,arr,key,res);
        if(arr[index] == key){
            res[0] = index;
        }
    }
}