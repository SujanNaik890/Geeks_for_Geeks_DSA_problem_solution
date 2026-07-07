
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int k) {
        // code here
        int n=arr.length;
        ArrayList<Integer> list = new ArrayList<>();
       int l=0,r=0,sum=0;
       while(r<n){
           sum+=arr[r];
           while(sum>k){
               sum-=arr[l];
               l++;
           }
           if(sum==k){
               list.add(l+1);
               list.add(r+1);
               return list;
           }
           r++;
       }
        list.add(-1);
        return list;
    }
}
