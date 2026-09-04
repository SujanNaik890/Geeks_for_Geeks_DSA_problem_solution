class Solution {
    public int smallestSubstring(String s) {
        // code here
        int last0=-1;
        int last1=-1;
        int last2=-1;
        
        int minlen= Integer.MAX_VALUE;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='0')last0=i;
            else if(ch=='1')last1=i;
            else if(ch=='2')last2=i;
            
            if(last0 != -1 && last1 !=-1 && last2 !=-1 ){
                int start= Math.min(last0,Math.min(last1,last2));
                minlen=Math.min(minlen,i-start+1);
            }
        }
        return minlen==Integer.MAX_VALUE ? -1 :minlen;
    }
};
