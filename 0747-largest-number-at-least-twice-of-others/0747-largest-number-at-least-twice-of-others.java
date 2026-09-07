class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        int product =1;
         for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                 index = i;
            }
         }
        int count =0;
        for(int i=0; i< nums.length;i++){
            if( i != index){
             product = nums[i] * 2 ;
            }
            if(product <= max){
                count++ ;
            }
        }
            if(count == nums.length){
                return index;
            }
        
        return -1 ;
    }
}