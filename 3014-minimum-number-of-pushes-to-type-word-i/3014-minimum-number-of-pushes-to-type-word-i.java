class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int totalPushes = 0;

        for (int i = 0; i < n; i++) {
            int pushes = (i / 8) + 1;
            totalPushes += pushes;
        }

        return totalPushes;
    }
}