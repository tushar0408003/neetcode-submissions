class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] arr = new int[nums.length];
        int n = nums.length;
       int prefix =1;
       for(int i =0; i<n; i++){
        arr[i] = prefix;
        prefix *= nums[i];
       }

        int sufix =1;
       for(int i =n-1; i>=0; i--){
        arr[i] *= sufix;
        sufix *= nums[i];
       }


        return arr;
    }
}  
