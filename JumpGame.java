//Jump Game

class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int max_reachable = 0;
        int reachable = 0;
        for(int i = 0; i < n; i++) {
            if(max_reachable<i)return false;
            reachable = nums[i]+i;
            max_reachable = Math.max(max_reachable, reachable);
        }
        return true;
    }
}
