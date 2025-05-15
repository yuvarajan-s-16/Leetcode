class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int flip=groups[0];
        ArrayList<String>s=new ArrayList<String>();
        for(int i=0;i<words.length;i++)
        {
            if(flip==groups[i])
            {
                s.add(words[i]);
                flip=1-flip;
            }
        }
        return s;
    }
}
