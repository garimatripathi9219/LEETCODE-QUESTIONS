class Solution {
    public int[] concatWithReverse(int[] nums) {
        //905
        int n = nums.length ;
        int[] arr = new int[2*n];
        int i =0;
        int j= 2 * n -1 ;
        while(i < j){
            arr[i]  = nums[i];
            arr[j] = nums[i] ;
            i++ ;
            j-- ;
        }
        return arr ;
       
    }
}