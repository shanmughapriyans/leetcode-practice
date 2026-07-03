//LC 3
//sliding window and two pointer in string
//time complexity : O(n)

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutReChars {
    public static void main(String[] args) {
        String s = "cadbzabcd";
        int maxLength = 0;
        int left = 0;
        int right = 0;
        int curLength;
        Map<Character, Integer> hash = new HashMap<>();
        while(right < s.length()){
            char ch = s.charAt(right);

            //if the element is there already and it is within the left right window
            if(hash.containsKey(ch) && hash.get(ch) >= left) left = hash.get(ch) + 1;

            curLength = right - left + 1;
            hash.put(s.charAt(right),right);
            
            maxLength = Math.max(curLength, maxLength);
            right++;
            System.out.println(s.substring(left,right)+" "+curLength);
        }
        System.out.println(maxLength);
    }
}
