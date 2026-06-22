class Solution {
   public String reorganizeString(String s) {

            int n = s.length();
            int [] freq = new int[26];

            for(char ch: s.toCharArray()){
                freq[ch -'a']++;
            }

            int max =0;
            int index = 0;
            for(int i =0 ; i < freq.length ; i++){
                if (max < freq[i]){
                    max = freq[i];
                    index =i;
                }
            }

            if (max > (n+1)/2 ) return "";

            char[] result = new char[n];
            int k =0;
//            even fill
            while (freq[index] -- > 0){
                result[k]= (char) (index + 'a');
                k += 2;
            }
//            remaining
            for(int i =0 ; i < freq.length; i++){

                while (freq[i] --> 0){
                    if (k >= result.length) k =1;
                    result[k]= (char) (i + 'a');
                    k +=2;
                }
            }
            return String.valueOf(result);
        }
}