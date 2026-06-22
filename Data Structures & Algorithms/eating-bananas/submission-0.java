class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int start = 1;        // minimum possible speed
        int end   = 0 ;// maximum possible speed


        for (int pile : piles) {
            end = Math.max(end, pile);
        }

        int k = end;                  

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int H = sumOFHour(mid, piles);

            if (H <= h) {
                k = mid;               
                end = mid - 1;         
            } else {
                start = mid + 1;       
            }
        }
        return k;
    }

    private int sumOFHour(int k, int[] piles) {
        int sum = 0;

        for (int i = 0; i < piles.length; i++) {
            sum += (int) Math.ceil((double) piles[i] / k);
        }
        return sum;
    }
}
