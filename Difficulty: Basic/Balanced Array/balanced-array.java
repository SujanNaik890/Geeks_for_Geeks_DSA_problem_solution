class Solution {
    public int minValueToBalance(List<Integer> arr) {
        // code here
    
    int rsum=0 , lsum=0;
        for(int i=0,j=arr.size()-1;i<arr.size()/2;i++,j--){
            lsum+=arr.get(i);
            rsum+=arr.get(j);
        }
    return Math.abs(lsum-rsum);
        
    }
}