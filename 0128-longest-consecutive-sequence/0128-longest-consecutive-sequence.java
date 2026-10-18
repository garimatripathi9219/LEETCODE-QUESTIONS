class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max =1;
        int count =1;
        if( nums.length ==0){
            return 0;
        }
        for(int i=0; i<nums.length-1;i++){
           
            if(nums[i]== nums[i+1]){
                continue;
            } // [1 2 10 11 12 13]
            //[0 1 1 2]
                else if(nums[i+1]-nums[i] ==1){
                count++ ;
                max = Math.max(max,count);
                 }else{
                    count =1;
                     max = Math.max(max,count);
                }
            }
        return max ;
    }
}