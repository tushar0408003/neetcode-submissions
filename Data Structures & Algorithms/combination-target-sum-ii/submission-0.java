class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(candidates);

            backtrack1(candidates, target, 0, new ArrayList<>(),result);
            return result;
        }
        private void backtrack1(int[] arr, int target, int index,
                               List<Integer> path,
                               List<List<Integer>> result) {
            if (target == 0) {
                result.add(new ArrayList<>(path));
                return;
            }
            if (target < 0) return;

            for(int i =index; i< arr.length; i++){

                if (i > index && arr[i] == arr[i-1]) continue;

                if (arr[i] > target) break;

                path.add(arr[i]);
                backtrack1(arr, target- arr[i], i+1,path, result);
                path.remove(path.size()-1);
            }

        }

}
