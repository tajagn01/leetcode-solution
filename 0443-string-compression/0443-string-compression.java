class Solution {
    public int compress(char[] chars) {
        int write = 0; 
        int i = 0;    

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

           
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            
            chars[write++] = currentChar;

            
            if (count > 1) {
                String cnt = String.valueOf(count);
                for (char c : cnt.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}
