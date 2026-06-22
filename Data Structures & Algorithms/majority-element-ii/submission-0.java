class Solution {
   public List<Integer> majorityElement(int[] nums) {

            List<Integer> list = new ArrayList<>();

            HashMap<Integer, Integer> map = new HashMap<>();

            int len = nums.length;
            for(int num :nums){
                map.put(num, map.getOrDefault(num, 0)+1);

            }
            for(int key : map.keySet()){
                if (map.get(key)> len/3){
                    list.add(key);
                }
            }
            return list;
        }
}