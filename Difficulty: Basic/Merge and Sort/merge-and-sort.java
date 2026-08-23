class Solution {
    public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {
        // code here
       HashSet<Integer> set=new HashSet<>();
       for(int i:arr1){
           set.add(i);
       }
       for(int j:arr2){
           set.add(j);
       }
       ArrayList<Integer> list=new ArrayList<>(set);
       
       Collections.sort(list);
       return list;
    }
}
