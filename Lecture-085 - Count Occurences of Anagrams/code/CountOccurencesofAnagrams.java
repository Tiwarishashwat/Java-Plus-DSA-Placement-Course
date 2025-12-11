

// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
        int patFreq[] = new int[26];
        int k = pat.length();
        //calc pat freq
        for(int i=0;i<k;i++){
            int index = pat.charAt(i)-97;
            patFreq[index]++;
        }
        // init window
         int txtFreq[] = new int[26];
         for(int i=0;i<k;i++){
            int index = txt.charAt(i)-97;
            txtFreq[index]++;
        }
        int count=0;
        if(Arrays.equals(txtFreq,patFreq)){
            count++;
        }
        int n = txt.length();
        //calc for other windows
        for(int i=1;i<n-k+1;i++){
            int removedCharIndex = txt.charAt(i-1)-97;
            int addedCharIndex = txt.charAt(i+k-1)-97;
            txtFreq[addedCharIndex]++;
            txtFreq[removedCharIndex]--;
            if(Arrays.equals(txtFreq,patFreq)){
            count++;
            }
        }
        return count;
    }   
}