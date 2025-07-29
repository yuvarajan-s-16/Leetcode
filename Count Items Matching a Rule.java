class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0;
        int i=0;
        if(ruleKey.equals("type"))
        {
            i=0;
        }
        if(ruleKey.equals("color"))
        {
            i=1;
        }
        if(ruleKey.equals("name"))
        {
            i=2;
        }
        for(int j=0;j<items.size();j++)
        {
            if((items.get(j).get(i)).equals(ruleValue))
            {
                c++;
            }
        }
        return items.size();
    }
}
