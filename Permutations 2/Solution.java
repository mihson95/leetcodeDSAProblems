class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permuteUnique(int[] nums) {
        ans = new ArrayList<>();
        permute(new ArrayList<Integer>(Arrays.stream(nums).boxed().toList()),0);
        return ans;
    }

    public void permute(List<Integer> currList, int index) {
        if(index == currList.size()){
            ans.add(new ArrayList<Integer>(currList));
            return;
        }
        Set<Integer> set = new HashSet<Integer>();
        for(int i = index; i < currList.size(); i++) {

            if(!set.contains(currList.get(i))) {
                Collections.swap(currList,i,index);
                permute(currList, index+1);
                Collections.swap(currList,i,index);
                set.add(currList.get(i));
            }
        }
    }
}
