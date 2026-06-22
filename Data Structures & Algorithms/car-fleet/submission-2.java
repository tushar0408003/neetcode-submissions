class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;
        Arrays.sort(idx, (a, b) -> Integer.compare(position[b], position[a])); 

        Deque<Double> stack = new ArrayDeque<>();
        for (int id : idx) {
            double time = (double) (target - position[id]) / speed[id];
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time); 
            } 
        }
        return stack.size();
    }
}
