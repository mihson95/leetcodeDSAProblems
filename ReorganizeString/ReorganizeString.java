class Solution {
    public String reorganizeString(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int mx = 0;
        char ch = ' ';
        
        for(char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
            if(mx < mp.get(c)) {
                mx = mp.get(c);
                ch = c;
            }
        }
        
        int n = s.length();
        char[] v = new char[n];
        int i = 0;
        while(mx-- > 0) {
            if(i >= n)
                return "";
            v[i] = ch;
            i += 2;
        }
        
        for(Map.Entry<Character, Integer> it : mp.entrySet()) {
            if(it.getKey() != ch) {
                int k = it.getValue();
                while(k-- > 0) {
                    if(i >= n)
                        i = 1;
                    v[i] = it.getKey();
                    i += 2;
                }
            }
        }
        
        StringBuilder ans = new StringBuilder();
        for(char c : v)
            ans.append(c);
        return ans.toString();
    }
}
