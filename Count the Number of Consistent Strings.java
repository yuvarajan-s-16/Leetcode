class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int allowedMask = maskString(allowed);
        int consistStrCnt = 0;
        for(var word : words){
            int wordMask = maskString(word);
            if((wordMask | allowedMask) == allowedMask)consistStrCnt++; 
        }
        return consistStrCnt;
    }
    private int maskString(String str){
        int strMask = 0;
        for(char ch : str.toCharArray()){
            int relPos = (ch - 'a');
            strMask |= (1<<relPos);
        }
        return strMask;
    }
}
