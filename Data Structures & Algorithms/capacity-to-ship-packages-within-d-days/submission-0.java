class Solution {

    public int shipWithinDays(int[] weights, int days) {

        int start = 0, end = 0;

        for (int w : weights) {
            start = Math.max(start, w); 
            end += w;                   
        }

        int ans = end;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int requiredDays = calculateDays(weights, mid);

            if (requiredDays <= days) {
                ans = mid;       
                end = mid - 1;    
            } else {
                start = mid + 1; 
            }
        }

        return ans;
    }

    private int calculateDays(int[] weights, int capacity) {

        int days = 1;
        int load = 0;

        for (int w : weights) {
            if (load + w > capacity) {
                days++;
                load = w;
            } else {
                load += w;
            }
        }
        return days;
    }
}
