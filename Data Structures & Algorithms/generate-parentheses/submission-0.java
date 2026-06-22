class Solution {
   public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        
        helper2(n, 0, 0, new String(), result);
        
        return result;
    }
    private void helper2(int n , int left , int right,String s,  List<String> result){
        if (n == left && n == right){
            result.add(s);
            return;
        }
        if (left < n) {
            helper2(n, left + 1, right, s+'(', result);
        }
        if (right< left){
            helper2(n, left, right+1, s+')', result);
        }
    }
}