class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low >= high)
        {
            return;
        }
        
        int pi = partition( arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi+1, high);
        
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        
        int pivot = arr[low];
        
        int i=low;
        int j=high;
        
        while(i<j)
        {
            
            while(i<high && arr[i]<=pivot) i++;
            
            while(j > low && arr[j] > pivot) j--;
            
            if(i<j)
            {
                swap(arr, i ,j);
            }
        }
        swap(arr, low, j);        
        return j;
    } 
    
    static void swap(int arr[], int i, int j)
    {
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }    
}