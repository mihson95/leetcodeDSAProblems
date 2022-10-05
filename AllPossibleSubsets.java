// all possible subsets

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        generateSubsets(0,nums,new ArrayList<Integer>(), res);
        return res;
    }
    
    public void generateSubsets(int index, int[] nums, List<Integer> current, 
                               List<List<Integer>> res) {
        res.add(new ArrayList<Integer>(current));
        for(int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generateSubsets(i+1,nums,current,res);
            current.remove(current.size()-1);
        }
    }
}
