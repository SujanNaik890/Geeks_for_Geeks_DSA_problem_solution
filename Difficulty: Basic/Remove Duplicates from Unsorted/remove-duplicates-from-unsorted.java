class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int i:arr){
            set.add(i);
        }
        ArrayList<Integer> list=new ArrayList<>(set);
        
        return list;
    }
}