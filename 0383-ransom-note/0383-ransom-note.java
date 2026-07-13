class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freqran = new int[26];
        int[] freqmag = new int[26];
        for(int i =0;i<ransomNote.length();i++){
        freqran[ransomNote.charAt(i) - 'a']++;
        }
         for(int i =0;i<magazine.length();i++){
        freqmag[magazine.charAt(i) - 'a']++;
        }
        for(int i = 0;i<26;i++){
            if(freqran[i] > freqmag[i]){
                return false;
            }
        }
        return true;
    }
}