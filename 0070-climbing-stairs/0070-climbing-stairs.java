class Solution {
    public int climbStairs(int n) {
        if(n == 0 || n == 1){
            return 1;
        }

        int fi =0;
        int se = 1;
        int sum =0;
        for(int i =0;i<n;i++){
            sum= fi + se;
            fi = se;
            se = sum;
        }
        return sum;

    }
}