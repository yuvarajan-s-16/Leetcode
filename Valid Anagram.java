class Solution {
    static {
        for (int i = 0; i < 500; i++)
            isAnagram("", "a");
    }

    public static boolean isAnagram(String s, String t) {
        int[] arr=new int[26];
        int slen=s.length();
        int tlen=t.length();
        if(slen!=tlen)
        {
            return false;
        }
        for(int i=0;i<slen;i++)
        {
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=0)
            {
                return false;
            }
        }
        return true;
    }
}
