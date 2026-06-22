class Solution {
    public int subsetXORSum(int[] nums) {

            int n =0;
            int sum =0;
            for(int i =0; i< nums.length; i++){
                n |= nums[i];
            }
            sum = n*(1<<(nums.length-1));
            return sum;
        }
}