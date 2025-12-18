class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time=0;
        for(int c=0;c<tickets.length;c++){
            if(c<=k){
                time = time + Math.min(tickets[c],tickets[k]);
            }else{
                time = time + Math.min(tickets[c],tickets[k]-1);
            }
        }
        return time;
    }
}