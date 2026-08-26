class Solution {
    public int convertFive(int n) {
        // code here
        if(n==0)return 5;
        
        int res=0,i=1;
        while(n>0){
            int diff=n%10;
            if(diff == 0)res=res+5 *i;
            else
                res=res+diff*i;
            
            i*=10;
            n/=10;
        }
        return res;
    }
}