class Solution { //1679
    public int minimumOperations(int[] nums) {
        boolean found = true ;
        int count =0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] % 3!=0){
                if((nums[i]+1) % 3 == 0 || (nums[i]-1) % 3 == 0){
                    count++ ;
            }
            }
            
        }
            return count ;
    }
}