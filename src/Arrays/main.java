package Arrays;


import java.util.ArrayList;
import java.util.Arrays;

public class main {


    // https://leetcode.com/problems/remove-element/
    static int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public int removeDuplicates(int[] nums) {
        int antall = nums.length;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                antall --;
                nums[i-1] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(nums);
        return antall;
    }
     // https://leetcode.com/problems/search-insert-position/
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int middle = (left+right)/2;
            if(nums[middle] == target)return middle;
            if(nums[middle] < target) left = middle+1;
            else right = middle-1;
        }
        return left;
    }

    public static void main(String[] args){
        int [] x = {3,2,2,3};
        System.out.println(Arrays.toString(x));
        removeElement(x, 3);
        System.out.println(Arrays.toString(x));
    }
}
