class Solution {
    public int leastInterval(char[] tasks, int n) {

            int[] freq = new int[26];

            for (char ch : tasks) {
                freq[ch - 'A']++;
            }

            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

            for (int f : freq) {
                if (f > 0) maxHeap.add(f);
            }

            int time = 0;

            while (!maxHeap.isEmpty()) {
                List<Integer> temp = new ArrayList<>();
                int cycle = n + 1;

                while (cycle > 0 && !maxHeap.isEmpty()) {
                    int curr = maxHeap.poll();
                    if (curr > 1) {
                        temp.add(curr - 1);
                    }
                    cycle--;
                    time++;
                }
                for (int t : temp) {
                    maxHeap.add(t);
                }
                if (maxHeap.isEmpty()) break;

                time += cycle;
            }
            return time;
        }
}