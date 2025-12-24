class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int startIndex = s.length()-1;
        while (startIndex>=0){
            while ( startIndex>=0 && s.charAt(startIndex)==' '){
                startIndex--;
            }
            if(startIndex<0){
                break;
            }
            int endIndex = startIndex;
            while ( startIndex>=0 && s.charAt(startIndex)!=' '){
                startIndex--;
            }
            // word
            if(res.length()==0){
                res.append(s.substring(startIndex+1,endIndex+1));
            } else {
                res.append(" ");
                res.append(s.substring(startIndex+1,endIndex+1));
            }
        }
        return res.toString();
    }
}