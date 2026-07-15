class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap <Character,Character> map = new HashMap<>();
        
        if(s.length() != t.length()){
            return false;

        }
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            char ch1 = t.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)!= ch1){
                    return false;
                }
            }else{
                 if (map.containsValue(ch1)) {
                    return false;
                }
                map.put(ch,ch1);
            }
        }
        return true;
       
    }
}