class Solution {
     public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        hepler31(s,0, new ArrayList<>(),result);
        return result;
    }
    private void hepler31(String s,int index , List<String> strings, List<List<String>> result){

         if (index == s.length()){
            result.add(new ArrayList<>(strings));
            return;
        }
        for(int i =index; i< s.length(); i++){
            if (isPalindrome(s, index, i)) {

                strings.add(s.substring(index, i + 1));
                hepler31(s, i + 1, strings, result);
                strings.remove(strings.size()-1);

            }
        }
    }
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}