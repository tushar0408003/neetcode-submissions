class Solution {
    public boolean carPooling(int[][] trips, int capacity) {

        Arrays.sort(trips, (a , b)-> a[1]-b[1]);

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                (a, b) -> a[2] - b[2]
        );

        int currPassengers = 0;

        for(int [] trip : trips){

            int Passengers = trip[0];
            int start = trip[1];
            int end = trip[2];

            while (!minHeap.isEmpty() && minHeap.peek()[2] <= start){
                currPassengers -= minHeap.poll()[0];
            }

            currPassengers += Passengers;
            if (currPassengers > capacity) return false;
            minHeap.add(trip);
        }
        return true;
    }
}