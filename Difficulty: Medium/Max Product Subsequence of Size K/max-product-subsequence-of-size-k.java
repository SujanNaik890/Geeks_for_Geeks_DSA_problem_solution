class Solution {
    public int maxProduct(int[] arr, int k) {
        // code here
            int n = arr.length;
            Arrays.sort(arr);
            if (k == n) {
                int prod = 1;
                for (int x : arr) prod *= x;
                return prod;
            }
            if (arr[n - 1] <= 0 && (k % 2 != 0)) {
                int prod = 1;
                for (int i = n - 1; i >= n - k; i--) {
                    prod *= arr[i];
                }
                return prod;
            }
            int prod = 1;
            int i = 0, j = n - 1;
            if (k % 2 != 0) {
                prod *= arr[j];
                j--;
                k--;
            }
            while (k > 0) {
                int leftProduct = arr[i] * arr[i + 1];
                int rightProduct = arr[j] * arr[j - 1];

                if (leftProduct > rightProduct) {
                    prod *= leftProduct;
                    i += 2;
                } else {
                    prod *= rightProduct;
                    j -= 2;
                }
                k -= 2;
            }
            return prod;
    }
}