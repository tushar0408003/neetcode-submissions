class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 

        for (int r = 0; r < k; r++) {

            int current = n - 1;        
            int prev = current - 1;     
            int temp = nums[current];   

            while (prev >= 0) {
                nums[prev + 1] = nums[prev];
                prev--;
            }

            nums[0] = temp;
        }
    }
}

