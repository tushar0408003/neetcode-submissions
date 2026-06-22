class Solution {
    public int mySqrt(int x) {

        if (x < 2) return x;

        int start = 1;
        int end = x / 2;

        while (start <= end) {

            long mid = start + (end - start) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            }
            else if (square < x) {
                start = (int) mid + 1;
            }
            else {
                end = (int) mid - 1;
            }
        }

        return end; 
    }
}
