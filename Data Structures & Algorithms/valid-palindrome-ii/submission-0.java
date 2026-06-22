class Solution {
      public boolean validPalindrome(String s) {

        char [] ch = s.toCharArray();
        int left =0;
        int right = ch.length-1;

        while (left < right){

            if(ch[left] != ch[right]){
                return isPalindrome(ch, left + 1, right) || isPalindrome(ch, left, right - 1);

            }
            left++;
            right--;

        }

        return true;
    }

    private boolean isPalindrome(char[] ch, int left, int right) {

        while (left < right) {
            if (ch[left] != ch[right]) return false;
            left++;
            right--;
        }
        return true;
    }
}