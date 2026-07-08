
import java.util.Arrays;

public class squaresOfaSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        
        int n = nums.length;
        int[] ans = new int[n];

        int left = 0;
        int right = n-1;
        int index = n-1;

        while(left <= right){
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
                ans[index] = nums[right] * nums[right];
                right--;
                index--;
            } else {
                ans[index] = nums[left] * nums[left];
                left++;
                index--;
            }
        }
        System.out.println(Arrays.toString(ans));

    }
}
