//User function Template for Java

class Solution 
{ 
    static int catchThieves(char arr[], int n, int k) 
	{ 
        // Code here
        int i=-1;
        int j=-1;
        for(int m=0;m<n;m++){
            if(i==-1 &&arr[m] == 'P') i=m;
            if(j==-1 &&arr[m] == 'T') j=m;
            if(i!=-1 && j!=-1) break;
        }
        if(i==-1 || j==-1) return 0;
        
        int caught=0;
        while(i<n && j<n){
            if(Math.abs(i-j) <= k) { // next police and thief
                caught++;
                i++;
                while(i<n && arr[i]!='P') i++;
                j++;
                while(j<n && arr[j]!='T') j++;
            }
            else if(i<j){ //next police
                i++;
                while(i<n && arr[i]!='P') i++;
            }else{ //next thief
                j++;
                while(j<n && arr[j]!='T') j++;
            }
        }
        return caught;
	} 
} 
