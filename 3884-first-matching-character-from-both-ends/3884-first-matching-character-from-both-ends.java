class Solution {
    public int firstMatchingIndex(String s) {
       // int min = 0;
        int n = s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== s.charAt(n-i-1)){
                return i ;
               // min = Math.min(min,i) ;
            }
        }
        return -1 ;
    } // i=1 , n-i-1
}