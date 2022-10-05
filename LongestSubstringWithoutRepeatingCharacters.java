class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0, r = 0;
        int max_len = 0;
        Map<Character,Integer> map = new HashMap<>();
        while(l<=r && r<n) {
            if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r)) >= l) {
                l = map.get(s.charAt(r)) + 1;
                map.put(s.charAt(r),r);
            }
            else {
                map.put(s.charAt(r),r);    
            }
            
            if(max_len < r-l+1){
                max_len = r-l+1;
            }
            r++;
        }
        return max_len;
    }
}