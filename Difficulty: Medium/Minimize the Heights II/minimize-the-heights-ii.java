import java.util.Arrays;

class Solution {
    int getMinDiff(int[] arr, int k) {

        Arrays.sort(arr);

        int n = arr.length;

        int ans = arr[n - 1] - arr[0];

        for (int i = 1; i < n; i++) {

            // Negative height not allowed
            if (arr[i] - k < 0)
                continue;

            int smallest = Math.min(arr[0] + k, arr[i] - k);

            int largest = Math.max(arr[n - 1] - k, arr[i - 1] + k);

            ans = Math.min(ans, largest - smallest);
        }

        return ans;
    }
}