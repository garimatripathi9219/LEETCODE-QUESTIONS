class Solution {
    public boolean checkString(String s) {
        int a =0 ;
        int b =0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
          if(ch == 'a'){
            a = i ; 
          }
           if(ch == 'b'){
            b = i ; 
            min = Math.min(min,b);
          }
        }
          if(a<=min){
            return true;
          }
        
          return false;
    }
}