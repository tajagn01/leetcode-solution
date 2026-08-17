class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        for(String w : word1){
            sb.append(w);
        }
        StringBuilder sb2 = new StringBuilder();
        for(String w : word2){
            sb2.append(w);
        }
        return sb.toString().equals(sb2.toString());
    }
}