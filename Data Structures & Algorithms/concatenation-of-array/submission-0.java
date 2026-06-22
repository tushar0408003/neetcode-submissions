class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] Array = new int[ 2*n ];
         
         for (int i =0; i<n; i++){
             Array[i] = nums[i] ;
             Array[i+n] = nums[i];
         }
         return Array;
    
    }
}