class Solution {
     public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        boolean [] seen = new boolean[nums.length];
        helper1(nums, seen, new ArrayList<>(), result);
        return result;
    }
    private void helper1(int [] arr ,boolean[] seen, List<Integer> list, List<List<Integer>> result){

        if (list.size() == arr.length){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i =0; i< arr.length; i++){

            if (seen[i]) continue;

            if (i > 0 && arr[i] == arr[i - 1] && !seen[i - 1]) continue;


            seen[i] = true;
            list.add(arr[i]);
            helper1(arr , seen, list, result);
            list.remove(list.size()-1);

            seen[i] = false;
        }

    }

}