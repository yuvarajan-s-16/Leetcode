class Solution {
    private String helper(String str){
        return Integer.toBinaryString(Integer.valueOf(str));    
    }
    
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        for(String str:date.split("-")){
            sb.append(helper(str));
            sb.append("-");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
