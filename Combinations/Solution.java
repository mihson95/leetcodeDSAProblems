class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        generateCombination(1,n,k,new ArrayList<Integer>());
        return ans;
    }

    public void generateCombination(int first, int n, int k, List<Integer> currList) {
        if(currList.size() == k){
            ans.add(new ArrayList<Integer>(currList));
            return;
        }
        for(int i = first; i <= n; i++) {
            currList.add(i);
            generateCombination(i+1,n,k,currList);
            currList.remove(Integer.valueOf(i));
        }
        return;
    }
}
