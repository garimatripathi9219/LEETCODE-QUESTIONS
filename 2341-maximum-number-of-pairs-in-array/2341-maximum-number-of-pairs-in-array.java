class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] answer = new int[2];
        int pairs =0;
        int leftovers =0;
        Arrays.sort(nums);
for(int i=0;i<nums.length-1 ;i++){
    if(nums[i] == nums[i+1]){
        pairs ++ ;
        i++ ;
    }
}
    leftovers = (nums.length) - (2 * pairs) ;

    answer[0] = pairs ;
    answer[1]= leftovers;
return answer ;
    }
}