class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        ArrayList<Integer> prefix = new ArrayList<>();
        ArrayList<Integer> suffix = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            suffix.add(0);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            prefix.add(sum);
        }

        sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += nums[i];
            suffix.set(i, sum);
        }

        for (int i = 0; i < n; i++) {
            int leftSum = (i == 0) ? 0 : prefix.get(i - 1);
            int rightSum = (i == n - 1) ? 0 : suffix.get(i + 1);

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}