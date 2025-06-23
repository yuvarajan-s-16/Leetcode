class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1=new StringBuilder();
        StringBuilder w2=new StringBuilder();
        for(int i=0;i<word1.length;i++)
        {
            w1.append(word1[i]);
        }
        for(int j=0;j<word2.length;j++)
        {
            w2.append(word2[j]);
        }
        return w1.toString().equals(w2.toString());
    }
}
