import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        Deque<Integer> onesPositions = new ArrayDeque<>();
        String result = "";
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '1') {
                onesPositions.addLast(right);
            }

            if (onesPositions.size() == k) {
                int currentStart = onesPositions.peekFirst();
                int currentLen = right - currentStart + 1;

                if (currentLen < minLen) {
                    minLen = currentLen;
                    result = s.substring(currentStart, right + 1);
                } else if (currentLen == minLen) {
                    String currentSubstring = s.substring(currentStart, right + 1);
                    if (currentSubstring.compareTo(result) < 0) {
                        result = currentSubstring;
                    }
                }

                onesPositions.removeFirst();
            }
        }

        return result;
    }
}