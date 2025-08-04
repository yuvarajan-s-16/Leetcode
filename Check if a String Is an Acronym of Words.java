class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb=new StringBuilder();
        for(String word:words)
        {
            sb.append(word.charAt(0));
        }
        String str=sb.toString();
        if(str.equals(s))
        {
            return true;
        }
        return false;
    }
}
