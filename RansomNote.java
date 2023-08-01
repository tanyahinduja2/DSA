class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length())
            return false;
        int magazineAlphabets[] = new int[26];
        for(char c : magazine.toCharArray()) {
            magazineAlphabets[c - 'a']++;
        }
        for(char c : ransomNote.toCharArray()) {
            if(magazineAlphabets[c - 'a'] == 0) {
                return false;
            }
            magazineAlphabets[c - 'a']--;
        }
        return true;
    }
}
