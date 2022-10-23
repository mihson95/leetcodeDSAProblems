//46. Permutations - Leetcode

class Solution {
    
    List<List<Integer>> ans;
    public void helper(List<Integer> currList, int index) {
        if(index == currList.size()) {
            ans.add(new ArrayList<Integer>(currList));
            return;
        }
        for(int i = index; i < currList.size(); i++) {
            Collections.swap(currList,i,index);
            helper(currList, index+1);
            Collections.swap(currList,i,index);
        }
        return;
    }
    
    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        helper(new ArrayList<Integer>(Arrays.stream(nums).boxed().toList()), 0);
        return ans;
    }
}
