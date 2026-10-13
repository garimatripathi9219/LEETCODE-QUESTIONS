class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int diff =0;
        int left =0;
        int right = 1;
        int max =0;
        while( right< nums.length){
            diff = nums[right]-nums[left];
            max = Math.max(max,diff);
            left++ ;
            right++;
        }
        return max ;
    }
}