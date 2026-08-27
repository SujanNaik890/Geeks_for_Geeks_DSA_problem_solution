
class Solution {
    int typeOfArr(int arr[]) {
        int n = arr.length;
        int minIdx = 0, maxIdx = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[minIdx]) minIdx = i;
            if (arr[i] > arr[maxIdx]) maxIdx = i;
        }

        if (arr[0] < arr[n - 1]) {
            if (minIdx == 0 && maxIdx == n - 1) return 1;
            return 3;
        } else {
            if (maxIdx == 0 && minIdx == n - 1) return 2;
            return 4;
        }
    }
}