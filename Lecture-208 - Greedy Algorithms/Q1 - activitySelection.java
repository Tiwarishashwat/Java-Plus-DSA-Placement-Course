class Solution {
    public int activitySelection(List<Integer> start, List<Integer> end) {
        // code here.
        int n = start.size();
        ArrayList<Integer> indexArr = new ArrayList<>();
        for(int i=0;i<n;i++){
            indexArr.add(i);
        }
        //sorting
        // [2,1,0,5,4,3]
        Collections.sort(indexArr, (a,b) -> (end.get(a) - end.get(b)));
        int maxActivity=1;
        int lastEnd = end.get(indexArr.get(0));
        for(int i=1;i<n;i++){
            int index = indexArr.get(i);
            if(start.get(index) > lastEnd){
                maxActivity++;
                lastEnd = end.get(index);
            }
        }
        return maxActivity;
    }
}