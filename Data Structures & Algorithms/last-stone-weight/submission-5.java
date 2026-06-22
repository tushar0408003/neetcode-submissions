class Solution {
     public int lastStoneWeight(int[] stones) {

            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

            for(int n : stones){
                maxHeap.add(n);
            }
            while (maxHeap.size() >= 2){
                int last = maxHeap.poll();
                int seconLast = maxHeap.poll();
                 
                maxHeap.add(last - seconLast);
            }

            return maxHeap.poll();
        }
}
