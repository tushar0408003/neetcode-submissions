class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int k = i + 1;
            int j = n - 1;

            while (k < j) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    k++;
                    j--;
                    while (k < j && nums[k] == nums[k - 1]) k++;
                    while (k < j && nums[j] == nums[j + 1]) j--;
                } else if (sum < 0) {
                    k++;
                } else {
                    j--;
                }
            }
        }
        return result;
    }
}