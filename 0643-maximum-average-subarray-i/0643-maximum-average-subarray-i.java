class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum =0;
      for(int i=0;i<k;i++){
        sum = sum+ nums[i];
      }
      int maxSum = sum ;
      double avg = 0;
      for(int j=k;j<nums.length;j++){
        sum = sum + nums[j]-nums[j-k];
        maxSum = Math.max(maxSum, sum);
      }
      avg = (double)maxSum/ k ;
      return avg ;
    }
}