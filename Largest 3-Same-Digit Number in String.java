class Solution {
    public String largestGoodInteger(String num) {
        String best = "";
        for (int i = 0; i + 2 < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)) {
                best = best.compareTo(num.substring(i, i+3)) > 0 ? best : num.substring(i, i+3);
            }
        }
        return best;
    }
}
