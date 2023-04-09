class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>();
        Arrays.sort(candidates);
        generateCombinationSum(0, new ArrayList<Integer>(), candidates, target);
        return ans;
    }

    public void generateCombinationSum(int first, List<Integer> currList, int[] candidates, int remaining) {
        if(remaining == 0){
            ans.add(new ArrayList<Integer>(currList));
            return;
        }
        for(int i = first; i < candidates.length; i++) {
            if(remaining-candidates[i] >= 0) {
                currList.add(candidates[i]);
                generateCombinationSum(i,currList,candidates,remaining-candidates[i]);
                currList.remove(Integer.valueOf(candidates[i]));
            }
            
        }
    }

}
