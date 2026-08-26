class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();

           int D = b * b - 4 * a * c;
           if(D < 0){
               ans.add(-1);
               return ans;
           }

           double x1 = (-b + Math.sqrt(D))/(2 * a);
           double x2 = (-b - Math.sqrt(D))/(2 * a);
           int f1 = (int) Math.floor(x1);
           int f2 = (int) Math.floor(x2);
           if(f1 >= f2){
               ans.add(f1);
               ans.add(f2);
           }else{
               ans.add(f2);
               ans.add(f1);
           }
           return ans;
    }
}