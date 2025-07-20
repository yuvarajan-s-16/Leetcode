class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");

        StringBuilder str = new StringBuilder();

        for(int i = 0 ; i<k;i++){
            str.append(arr[i]);
            if(i!= k-1) str.append(" ");
        }
    return str.toString();
    }
}
