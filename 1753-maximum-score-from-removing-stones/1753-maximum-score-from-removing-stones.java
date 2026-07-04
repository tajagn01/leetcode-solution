class Solution {
    public int maximumScore(int a, int b, int c) {
        int total = a + b + c;
        int maxPile = Math.max(a, Math.max(b, c));
        
        return Math.min(total / 2, total - maxPile);
    }
}