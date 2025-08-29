class Solution {
    public String generateTheString(int n) {
        char[] ch=new char[n];
        for(int i=0;i<n-1;i++)
        {
            ch[i]='a';
        }
        ch[n-1]=(n%2==0)?'b':'a';
        return new String(ch);
    }
}
