class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

            int i = findfloor(arr, x);
            int j = i + 1;

            List<Integer> ans = new ArrayList<>();

            while (i >= 0 && j < arr.length && k > 0) {
                if (Math.abs(arr[i] - x) <= Math.abs(arr[j] - x)) {
                    ans.add(arr[i--]);
                } else {
                    ans.add(arr[j++]);
                }
                k--;
            }

            while (i >= 0 && k > 0) {
                ans.add(arr[i--]);
                k--;
            }

            while (j < arr.length && k > 0) {
                ans.add(arr[j++]);
                k--;
            }

            Collections.sort(ans);

            return ans;
        }

        private int findfloor(int[] arr, int x) {
            int left = 0;
            int right = arr.length - 1;
            int ans = -1; 

            while (left <= right) {
                int mid = (left + right) / 2;

                if (arr[mid] == x) {
                    return mid; 
                } else if (arr[mid] < x) {
                    ans = mid;       
                    left = mid + 1;  
                } else {
                    right = mid - 1;
                }
            }
            return ans;
        }
}