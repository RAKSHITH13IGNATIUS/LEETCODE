class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;       // Pointer for last valid element in nums1
        int p2 = n - 1;       // Pointer for last element in nums2
        int i = m + n - 1;    // Pointer for last position in nums1

        // Merge in reverse order
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i--] = nums1[p1--]; // Take element from nums1
            } else {
                nums1[i--] = nums2[p2--]; // Take element from nums2
            }
        }
    }
}
