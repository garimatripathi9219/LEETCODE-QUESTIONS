class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        //[ 1 2 2 3 5]
        for(int i=0; i<nums.length;i++){
            if(target == nums[i]){
                list.add(i);
            }
        }
        return list ;

        
    }
}