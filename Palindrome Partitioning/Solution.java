class Solution {

    List<List<String>> ans;

    public List<List<String>> partition(String s) {
        ans = new ArrayList<>();
        generatePalindromePartitioning(0,new ArrayList<String>(),s);
        return ans;
    }

    public void generatePalindromePartitioning(int first, List<String> currList, String s) {
        if(first == s.length()){
            ans.add(new ArrayList<String>(currList));
            return;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = first; i < s.length(); i++){
            sb.append(s.charAt(i));
            String appendedString = sb.toString();
            if(isPalindrome(appendedString)){
                currList.add(sb.toString());
                generatePalindromePartitioning(i+1,currList,s);
                currList.remove(currList.size()-1);
            }
        }
    }

    public boolean isPalindrome(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
