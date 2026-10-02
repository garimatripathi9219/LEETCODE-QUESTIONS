class Solution {
    public int countSpecialIntegers(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int freq = 0;

            // frequency count
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    freq++;
                }
            }

            // exactly 3 times
            if (freq != 3) {
                continue;
            }

            int first = -1;
            int second = -1;
            int third = -1;

            // positions find karo
            for (int j = 0; j < nums.length; j++) {

                if (nums[j] == nums[i]) {

                    if (first == -1) {
                        first = j;
                    }
                    else if (second == -1) {
                        second = j;
                    }
                    else {
                        third = j;
                    }
                }
            }

            // equally spaced check
            if (second - first == third - second) {
                count++;
            }
        }

        // same number ko baar-baar count hone se bachana
        count = count / 3;

        return count;
    }
}