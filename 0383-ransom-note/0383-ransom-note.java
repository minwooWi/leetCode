class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransomCount = new int[26];
        int[] magazineCount = new int[26];
        
        for (char c : ransomNote.toCharArray()) {
            ransomCount[c - 'a']++;
        }
        
        for (char c : magazine.toCharArray()) {
            magazineCount[c - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (ransomCount[i] > magazineCount[i]) {
                return false;
            }
        }
        
        return true;
    }
}