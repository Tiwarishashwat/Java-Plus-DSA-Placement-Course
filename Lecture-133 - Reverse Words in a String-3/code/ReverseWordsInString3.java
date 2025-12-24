class Solution {
    public String reverseWords(String s) {
        // convert to char array
        char arr[] = s.toCharArray(); // use sb
        int len = arr.length;
        int startPointer = 0;
        for(int endPointer = 0;endPointer<=len; endPointer++){
            // word will end at space or at end of string
            if(endPointer==len || arr[endPointer]==' '){
                reverse(arr,startPointer,endPointer-1);
                // first char of next word.
                startPointer = endPointer+1;
            }
        }
        return new String(arr);
    }

    public static void  reverse(char arr[],int startPointer,int endPointer){
        while(startPointer<endPointer){
            char temp = arr[startPointer];
            arr[startPointer] = arr[endPointer];
            arr[endPointer] = temp;
            startPointer++;
            endPointer--;
        }
    }
}


















