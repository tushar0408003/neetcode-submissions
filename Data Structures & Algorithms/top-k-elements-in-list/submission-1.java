class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap();

        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        int [] arr = new int[k];

         PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
      
       for(int key : map.keySet()){
        maxHeap.offer(key);
       }

       for(int i =0; i<k; i++){
        arr[i] = maxHeap.poll();
       }

        return arr;
    }
}
