class Solution {
    public int search(int[] a, int t) {
        int l = 0, right = a.length - 1;
        while (l <= right) {
            int mid = (l + right) / 2;
            if (a[mid] == t) return mid;
            if (a[l] <= a[mid]) {
                if (a[l] <= t && t < a[mid]) right = mid - 1;
                else l = mid + 1;
            } else {
                if (a[mid] < t && t <= a[right]) l = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
}