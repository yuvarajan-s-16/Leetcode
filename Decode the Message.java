class Solution {
    public String decodeMessage(String key, String message) {
        char[] hashes = new char[128];
        hashes[32] = 32;  //Ascii value of spaces is 32 and it will be unchainged
        char ch='a';
        for (char c : key.toCharArray()) {
            char hash = hashes[c];
            if (hash == 0) {
                hashes[c] = ch++;
            }
        }
        char[] result = new char[message.length()];
        for (int j = 0; j < message.length(); j++) {
            result[j] = hashes[message.charAt(j)];
        }
        return new String(result);
    }
}
