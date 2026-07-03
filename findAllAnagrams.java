//LC 438
//sliding window and two pointer in string
//time complexity : O(n)

import java.util.ArrayList;
import java.util.List;

class findAllAnagrams{
    public static void main(String[] args){
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> indexes = new ArrayList<>();

        //initialize frequency map
        int n = s.length();
        int[] anagramValue = new int[26];
        for(int i = 0; i<p.length(); i++){
            anagramValue[p.charAt(i) - 'a']++;
        }

        //two pointers
        int left = 0;
        int right = 0;

        //required count to form anagram
        int count = p.length();

        while(right < n){
            //add right value
            if(anagramValue[s.charAt(right) - 'a'] > 0) count--;

            anagramValue[s.charAt(right) - 'a']--;
            right++;

            //remove left value
            if(right - left > p.length()){
                if(anagramValue[s.charAt(left) - 'a'] >= 0) count++;

                anagramValue[s.charAt(left) - 'a']++;
                left++;
            }
            if(count == 0) indexes.add(left);
        }
        System.out.println(indexes.toString());
    }
}