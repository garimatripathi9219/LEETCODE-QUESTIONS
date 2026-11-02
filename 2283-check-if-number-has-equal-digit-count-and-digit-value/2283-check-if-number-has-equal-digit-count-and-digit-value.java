class Solution {
    public boolean digitCount(String num) {
        //3190 453 2491
        int[] freq = new int[10];
        for(int i=0; i<num.length();i++){
          int digit = num.charAt(i)-'0';
          freq[digit]++ ;
            
        }
        for(int i=0; i<num.length();i++){
            if(freq[i] != num.charAt(i)-'0'){
                return false;
            }
        }
            return true ;
    }
}