//Jump Game 2
//using linear BFS

class Solution {
    public int jump(int[] nums) {
        int l = 0, r = 0;
        int n = nums.length;
        int farthest = 0;
        int res = 0;
        while(r<n-1) {
            for(int i = l; i <= r; i++) {
                farthest = Math.max(farthest, nums[i]+i);
            }
            l=r+1;
            r=farthest;
            res++;
        }
        return res;
    }
}
