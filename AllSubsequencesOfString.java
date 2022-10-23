//Power Set - Practice GeeksForGeeks

// Driver Code Starts
//Initial Template for Java
//Driver Code Ends


//User function Template for Java

class Solution
{
    List<String> list;
    public void helper(String currString, String tempString, int index) {
        if(index == currString.length()) {
            if(!tempString.isEmpty())
                list.add(tempString);
            return;
        }
        helper(currString, tempString+""+currString.charAt(index), index+1);
        helper(currString, tempString, index+1);
        return;
    }
    
    public List<String> AllPossibleStrings(String s)
    {   
        list = new ArrayList<String>();
        helper(s,"",0);
        Collections.sort(list);
        return list;
    }
}
