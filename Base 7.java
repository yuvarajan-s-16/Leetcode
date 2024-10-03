class Solution {
    public String convertToBase7(int num) {
        
        String s="";
        if(num==0) return s+"0";
        int n=Math.abs(num);
        while(n!=0)
        {
            s+=n%7;
            n/=7;
        }
        if(num<0)
        {
            s=s+"-";
        }
        StringBuilder s1=new StringBuilder(s);
        return s1.reverse().toString();
    }
}


//another method
//return Integer.toString(num, 7);
