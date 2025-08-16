class Solution {
    public int maximum69Number (int num) {
        char[] a=String.valueOf(num).toCharArray();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='6')
            {
                a[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(a));  
    }
}
