class Solution {
    public int pivotInteger(int n) {
        int left = 0;
        int right = 0;
         int sum  = n*(n+1)/2;
        for(int i = 1;i<=n;i++){
        left += i;
         right = sum - left+ i;
         if(left == right){
            return i;
         }
        
        }
        return -1;
        
    }
}