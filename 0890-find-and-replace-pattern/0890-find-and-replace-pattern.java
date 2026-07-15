class Solution {
     public String createMapping(String s){
        char ch = 'a';
        int n = s.length();
        char[] arr = new char[256];
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(arr[c]==0){
                arr[c]=ch;
                ch++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(arr[s.charAt(i)]);
        }
        return sb.toString();
     }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> res = new ArrayList<>();
        String ans = createMapping(pattern);
        for(String word: words){
            if(createMapping(word).equals(ans)){
            res.add(word);}
        }
        return res;
    }
}