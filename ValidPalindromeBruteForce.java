class Solution {
    public boolean isPalindrome(String s) {
        if(s == "" || s == " ") 
            return true;
        String str = strFormation(s);
        int len = str.length();
        for(int i = 0; i < len; i++) {
            if(str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public String strFormation(String s) {
        String str = "";
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(Character.isLetterOrDigit(curr)) {
                str += Character.toLowerCase(curr);
            }
        }
        return str;
    }
}
