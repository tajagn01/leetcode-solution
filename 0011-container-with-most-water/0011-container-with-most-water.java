class Solution {
    public int maxArea(int[] height) {
        int are = 0;
        int max_one  = 0;
        int max_two = height.length -1;
        while(max_one < max_two){
            int h = Math.min(height[max_one], height[max_two]);
            int w = max_two - max_one;
            are = Math.max(are,h * w);
            if(height[max_one] < height[max_two]){
                max_one++;
            }else{
                max_two--;
            }
        }
        return are;
    }
}