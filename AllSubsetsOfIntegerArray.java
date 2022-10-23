// all subsets
//78. Subsets - Leetcode

class Solution {
    
    List<List<Integer>> ans;
    public void helper(List<Integer> numsList, List<Integer> tempList, int index) {
        if(index == numsList.size()){
            ans.add(tempList);
            return;
        }
        //clone of tempList by passing as parameter in constructor of ArrayList
        helper(numsList, new ArrayList<>(tempList), index+1);
        tempList.add(numsList.get(index));
        //clone of tempList by passing as parameter in constructor of ArrayList
        helper(numsList, new ArrayList<>(tempList), index+1);
        return;
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        helper(Arrays.stream(nums)
                     .boxed()
                     .toList(),new ArrayList<Integer>(),0);
        return ans;
    }
}
