import java.util.*;
class Solution {
    public void dfs(String srcEmail,HashSet<String> visited,HashMap<String,List<String>> adjMap,List<String> sublist){
        visited.add(srcEmail);
        sublist.add(srcEmail);
        if(!adjMap.containsKey(srcEmail)){
            return;
        }
        for(String neighbour : adjMap.get(srcEmail)){
            if(!visited.contains(neighbour)){
                dfs(neighbour,visited,adjMap,sublist);
            }
        }
    }
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        //adj map
        HashMap<String,List<String>> adjMap = new HashMap<>();
        for(List<String> account : accounts){
            String firstEmail = account.get(1);
            for(int i=2;i<account.size();i++){
                String email = account.get(i);
                if(!adjMap.containsKey(firstEmail)){
                    adjMap.put(firstEmail,new ArrayList<>());
                }
                adjMap.get(firstEmail).add(email);

                if(!adjMap.containsKey(email)){
                    adjMap.put(email,new ArrayList<>());
                }
                adjMap.get(email).add(firstEmail);
            }
        }
        List<List<String>> res = new ArrayList<>();
        HashSet<String> visited = new HashSet<>();
        for(List<String> account : accounts){
            String firstEmail = account.get(1);
            if(!visited.contains(firstEmail)){
                List<String> sublist = new ArrayList<>();
                dfs(firstEmail,visited,adjMap,sublist);
                Collections.sort(sublist);
                sublist.add(0,account.get(0));
                res.add(sublist);
            }
        }
        return res;

    }
}