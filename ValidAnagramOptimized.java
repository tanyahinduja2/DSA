class Solution {
    public boolean isAnagram(String s, String t) {
        int alphabetArr[] = new int[26];
        for(int i = 0; i < s.length(); i++) {
            alphabetArr[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++) {
            alphabetArr[t.charAt(i) - 'a']--;
        }
        for(int i : alphabetArr) {
            if(i != 0)
                return false;
        }
        return true;
    }
}
