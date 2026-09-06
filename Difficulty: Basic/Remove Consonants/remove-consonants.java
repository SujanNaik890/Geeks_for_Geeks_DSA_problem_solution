class Solution {
    String remConsonants(String s) {
        // code here
        String vowel="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='A'){
                vowel+=ch;
            }
            else if(ch=='e' || ch=='E
            \'){
                vowel+=ch;
            }
            else if(ch=='i' || ch=='I'){
                vowel+=ch;
            }
            else if(ch=='o' || ch=='O'){
                vowel+=ch;
            }
            else if(ch=='u' || ch=='U'){
                vowel+=ch;
            }
        }
        return vowel;
    }
};