class Solution {
    public int splitArray(int[] arr, int k) {
        // code here
             int n = arr.length;
        int low = 0;
        int high = 0;

        for (int num : arr) {
            low = Math.max(low, num);
            high += num;
        }

        int result = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(arr, k, mid)) {
                result = mid;
                high = mid - 1; // Try for a smaller maximum
            } else {
                low = mid + 1; // Increase the limit
            }
        }
        return result;
    }

    private static boolean isPossible(int[] arr, int k, int mid) {
        int subarrays = 1;
        int currentSum = 0;

        for (int num : arr) {
            if (currentSum + num <= mid) {
                currentSum += num;
            } else {
                subarrays++;
                currentSum = num;
                if (subarrays > k) return false;
            }
        }
        return true;
    }
}