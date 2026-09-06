class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        // code here
        TreeSet<Integer> list1=new TreeSet<>();
        TreeSet<Integer> list2=new TreeSet<>();
        TreeSet<Integer> list=new TreeSet<>();
        for(int i:a){
            list1.add(i);
        }
        for(int i:b){
            if(list1.contains(i))
                list2.add(i);
        }
        for(int i:c){
            if(list2.contains(i))list.add(i);
        }
        return new ArrayList<>(list);
    }
}