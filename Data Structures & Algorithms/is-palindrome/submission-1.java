class Solution {
    public boolean isPalindrome(String s) {
      String str = s.toLowerCase().trim();

      int r = str.length()-1;
      int l =0;  

      while(l< r){
        while(l < r && !Character.isLetterOrDigit(str.charAt(l))) l++;
        while(l < r && !Character.isLetterOrDigit(str.charAt(r))) r--;

        if(str.charAt(l) != str.charAt(r)){
            return false;
        }
        l++;
        r--;
      }  
      return true;
      }
}
