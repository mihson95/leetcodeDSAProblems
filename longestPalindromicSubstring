// Longest Palindromic Substring


class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int max_len = 1;
        int start = 0, end = 0;
        for(int i = 0; i < n; i++) {
            int l = i, r = i;
            while(l>=0 && r<n){
                if(s.charAt(l) == s.charAt(r)){ 
                    l--;r++;
                }
                else break;
            }
            if(max_len < r-l-1) {
                max_len = r-l-1;
                start = l+1;
                end = r-1;
            }
            l = i; r = i+1;
            while(l>=0 && r<n){
                if(s.charAt(l) == s.charAt(r)){
                    l--;r++;
                }
                else break;
            }
            if(max_len < r-l-1) {
                max_len = r-l-1;
                start = l+1;
                end = r-1;
            }
        }
        return s.substring(start, end+1);
    }
}
