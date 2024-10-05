class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0,c=0;
        for(int i=0;i<s.length();i++)
        {
            while(j<t.length())
            {
                if(s.charAt(i)==t.charAt(j))
                {
                      c++;
                      j+=1;
                      break;
                }
                j+=1;
            }
        }
        if(s.length()==c)
        {
            return true;
        }
        return false;
    }
}
