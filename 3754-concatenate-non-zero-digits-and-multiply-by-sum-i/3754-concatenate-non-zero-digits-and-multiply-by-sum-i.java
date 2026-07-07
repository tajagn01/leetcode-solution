class Solution {
    public long sumAndMultiply(int n) {
        if (n == 0) return 0;
        
        long reversedX = 0;
        int sum = 0;
        
        while (n > 0) {
            int d = n % 10;
            if (d != 0) {
                sum += d;
                reversedX = reversedX * 10 + d;
            }
            n /= 10;
        }
        
        long x = 0;
        while (reversedX > 0) {
            x = x * 10 + (reversedX % 10);
            reversedX /= 10;
        }
        
        return x * sum;
    }
}