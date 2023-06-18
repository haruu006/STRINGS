///For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

//Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

//Example 1:

//Input: str1 = "ABCABC", str2 = "ABC"
//Output: "ABC"


class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int m=str1.length();
        int n=str2.length();
        if(m<n){
            return gcdOfStrings(str2,str1);
        }
        else if(!str1.startsWith(str2)){
            return "";
        }
        else if(str2.isEmpty()){
            return str1;
        }
        else{
            return gcdOfStrings(str1.substring(n),str2);
        }
    }
}
