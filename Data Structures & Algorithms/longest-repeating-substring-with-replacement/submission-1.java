class Solution {
      public int characterReplacement(String s, int k){

        int[] ch = new int[26];
        int left = 0;
        int maxLength = 0;
        int maxCount = 0;

        for (int right =0; right < s.length();right++){
            char ch1 = s.charAt(right);
            ch[ch1 -'A']++;
            maxCount = Math.max(maxCount, ch[ch1- 'A']);
            
            while((right - left +1) - maxCount > k){
                char leftChar = s.charAt(left);      
                ch[leftChar - 'A']--;                 
                 left++;
            }
            maxLength= Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}
