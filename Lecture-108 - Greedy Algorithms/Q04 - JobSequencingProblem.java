



class Solution {

    public ArrayList<Integer> JobSequencing(int[] id, int[] deadline, int[] profit) {
        // code here..
        //find the max deadline
        int n = 0;
        for(int d : deadline){
            n = Math.max(n,d);
        }
        int assignedJobs[] = new int[n+1];
        Arrays.fill(assignedJobs,-1);
        int len = profit.length;
        Integer index[] = new Integer[len];
        for(int i=0;i<len;i++){
            index[i] = i;
        }
        Arrays.sort(index, (a,b) -> profit[b] - profit[a]);
        int count=0;
        int maxProfit=0;
        for(int i=0;i<len;i++){
            int ind = index[i];
            int d = deadline[ind];
            while(assignedJobs[d]!=-1) d--;
            if(d==0) continue;
            count++;
            assignedJobs[d]= id[ind];
            maxProfit += profit[ind];
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(count);
        res.add(maxProfit);
        return res;
    }
}
