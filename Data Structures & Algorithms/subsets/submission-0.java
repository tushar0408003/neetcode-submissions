class Solution {
    public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());

            for(int n : nums) {
                int size = result.size();
                for (int i = 0; i < size; i++) {
                    List<Integer> list = new ArrayList<>(result.get(i));
                    list.add(n);
                    result.add(list);
                }
            }
            return result;
        }
}
