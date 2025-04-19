class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);  // Step 1: Sort the array
        long count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Step 2: Use binary search to find the valid range for nums[i]
            int left = lowerBound(nums, i + 1, n - 1, lower - nums[i]);
            int right = upperBound(nums, i + 1, n - 1, upper - nums[i]);

            if (left <= right) {
                count += right - left + 1;
            }
        }

        return count;
    }

    // Finds the first index in [start, end] such that nums[index] >= target
    private int lowerBound(int[] nums, int start, int end, int target) {
        int l = start, r = end;
        int ans = end + 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    // Finds the last index in [start, end] such that nums[index] <= target
    private int upperBound(int[] nums, int start, int end, int target) {
        int l = start, r = end;
        int ans = start - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= target) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}