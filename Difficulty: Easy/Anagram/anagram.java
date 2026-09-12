class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length())return false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:s1.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(char i:s2.toCharArray()){
            if(!map.containsKey(i)){
                return false;}
            int count=map.get(i);
            if(count==1){
                map.remove(i);
            }
            else map.put(i,count-1);
        }
        return true;
    }
}