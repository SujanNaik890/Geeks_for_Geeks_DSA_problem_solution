class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
          int max = arr[arr.length - 1];
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = arr.length - 1; i >= 0; i--){
            if(max <= arr[i]){
                max = arr[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
