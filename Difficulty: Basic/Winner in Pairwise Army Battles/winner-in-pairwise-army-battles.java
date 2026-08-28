class Solution {
    public String countryAtWar(int[] arr1, int[] arr2) {
        // code here
        int cntA=0,cntB=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>arr2[i])cntA++;
            else if(arr1[i]<arr2[i])cntB++;
        }
        if(cntA==cntB) return "DRAW";
        return (cntA>cntB)?"A":"B";
    }
}