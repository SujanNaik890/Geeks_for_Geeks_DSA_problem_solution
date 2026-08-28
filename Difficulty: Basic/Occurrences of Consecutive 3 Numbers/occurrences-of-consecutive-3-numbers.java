class Solution {
    public int specialIntegers(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        int totalCount = 0;
        for (int x : set) {
            if (set.contains(x) && set.contains(x - 1) && set.contains(x + 1)) {
                totalCount++;
            }
        }

        return totalCount;
    }
}