class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for(int i =0;i<nums.length;i++){
            arr[i] = String.valueOf(nums[i]);
        }
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length-1;j++){
                String a =arr[j];
                String b = arr[j+1];
                if((b+a).compareTo(a+b)>0){
                    String temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
                if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for(int i =0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}