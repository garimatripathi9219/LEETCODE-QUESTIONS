class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] freqM = new int[26];

        for(int i = 0; i < magazine.length(); i++){
            char ch = magazine.charAt(i);
            freqM[ch - 'a']++;
        }

        int[] freqR = new int[26];

        for(int i = 0; i < ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            freqR[ch - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(freqM[i] < freqR[i]){
                return false;
            }
        }

        return true;
    }
}