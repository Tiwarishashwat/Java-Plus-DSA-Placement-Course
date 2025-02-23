

// User function Template for Java
class Solution {
    class Item implements Comparable<Item>{
        int val;
        int wt;
        double ratio;
        Item(int v, int w){
            val = v;
            wt = w;
            ratio = (double)val/(double)wt;
        }
        //dec order of ratio sort
        public int compareTo(Item that){
            if(this.ratio <= that.ratio) return 1;
            return -1;
        }
    }
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        // code here
        int n = val.size();
        ArrayList<Item> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new Item(val.get(i) , wt.get(i)));
        }
        Collections.sort(list);
        
        double res=0.0;
        for(Item item : list){
            if(item.wt>=capacity){
                res += (capacity * item.ratio);
                capacity=0;
            }else{
                res+= item.val;
                capacity -= item.wt;
            }
            if(capacity==0) break;
        }
        return res;
        
    }
}



