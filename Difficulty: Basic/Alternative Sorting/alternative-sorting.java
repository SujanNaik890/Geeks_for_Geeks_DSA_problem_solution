class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        // code here
        ArrayList<Integer> list =new ArrayList<>();
        
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(i<j){
           list.add(arr[j]);
           list.add(arr[i]);
           j--;
           i++;
        }
        if(i==j)
            list.add(arr[i]);
        return list;
    }
}
