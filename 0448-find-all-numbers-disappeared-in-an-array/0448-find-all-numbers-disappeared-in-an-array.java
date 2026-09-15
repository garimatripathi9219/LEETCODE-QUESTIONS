class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>() ;
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            set.add(nums[i]); //[4,3,2,7,8,2,3,1]
        }
        for(int j =1; j<= nums.length; j++){
        if(!set.contains(j)){
            list.add(j);
        }
        }
        return list ;
    }
}