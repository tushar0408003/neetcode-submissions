class Solution {
   public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            boolean[] seen = new boolean[nums.length];
            
            helper(nums, seen, new ArrayList<>(), result);
            
            return result;
        }
        private void helper(int [] arr ,boolean[] seen, List<Integer> list, List<List<Integer>> result){
            if (list.size() == arr.length){
                 result.add(new ArrayList<>(list));
                 return;
            }

            for(int i =0; i<arr.length; i++){
                if (seen[i]) continue;

                seen[i] = true;
                list.add(arr[i]);
                helper(arr, seen, list, result);

                list.remove(list.size()-1);
                seen[i] = false;
            }
        }
}
