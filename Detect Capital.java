class Solution {
    public boolean detectCapitalUse(String word) {
    int l=word.length();
    int condition=97;
    if(l==1) return true;
    else if((int)word.charAt(1)<=90 && (int)word.charAt(0)<=90)
    {
        condition=96;
        for(int i=1;i<l;i++)
        {
           if(!((int)word.charAt(i)<condition))
           return false;
        }
    }
    else{
    for(int i=1;i<l;i++)
    {
       if(!((int)word.charAt(i)>=condition))
       {
         return false;
       }
    } 
    }
    return true;
    }
}
