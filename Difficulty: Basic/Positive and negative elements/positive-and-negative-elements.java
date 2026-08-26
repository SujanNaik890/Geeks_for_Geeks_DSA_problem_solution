class Solution {
    public ArrayList<Integer> arranged(int[] arr) {
        // code here
      int n = arr.length;


      ArrayList<Integer> pos = new ArrayList<>();
      ArrayList<Integer> neg = new ArrayList<>();
      ArrayList<Integer> faiz = new ArrayList<>();

      for (int i = 0; i < n; i++) {
          if (arr[i] < 0) {
              neg.add(arr[i]);
          } else {
              pos.add(arr[i]);
          }
      }

      int i = 0, j = 0;
      while (i < pos.size() && j < neg.size()) {
          faiz.add(pos.get(i++));
          faiz.add(neg.get(j++));
      }

      while (i < pos.size()) {
          faiz.add(pos.get(i++));
      }
      while (j < neg.size()) {
          faiz.add(neg.get(j++));
      }

      return faiz; 
    }
}