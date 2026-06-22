class Solution {
    public int[] topKFrequent(int[] nums, int k) {


        HashMap<Integer, Integer> map = new HashMap<>();
        int [] Array = new int[k];

        for (int i =0; i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }
        for (int i =0; i< k; i++) {

            int maxCount = 0;
            int highestElement = -1;

            for (int key : map.keySet()) {
                if (map.get(key) > maxCount) {
                    maxCount = map.get(key);
                    highestElement = key;
                }
            }

            Array[i] = highestElement;
            
            map.remove(highestElement);
        }

        return Array;

    }
}
