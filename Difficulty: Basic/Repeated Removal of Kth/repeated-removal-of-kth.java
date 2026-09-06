class Solution {
    public int getCandidate(int n, int k) {
        // code here
        int ans=1;
        while(ans *k <=n){
            ans *=k;
        }
        return ans;
    }
}