class Substrings{ 
public static void main(String[] args) {
        printAllSubstring("abc");
    }

public static void printAllSubstring(String input){
        int n = input.length();
        for(int startIndex=0;startIndex<n;startIndex++){
            for(int endIndex = startIndex+1;endIndex<=n;endIndex++){
                System.out.println(input.substring(startIndex,endIndex));
            }
        }
    }
}