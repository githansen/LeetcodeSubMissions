package Strings.Medium;


import java.util.Arrays;

public class Medium {
    //https://leetcode.com/problems/length-of-last-word/
    public int lengthOfLastWord(String s) {
        int lengde = s.length();
        int i = lengde-1;
        while(i >= 0 && s.charAt(i) == ' ')i--;
        int sum = 0;
        while(i >= 0 &&s.charAt(i) != ' '){
            sum++;
            i--;
        }
        return sum;
    }
    //https://leetcode.com/problems/rotate-array/
    public static void rotate(int[] nums, int k) {
        while(k > nums.length) k -= nums.length;
        int[] temp = new int[nums.length];
        System.arraycopy(nums, nums.length-k, temp, 0, k);
        System.arraycopy(nums,0,nums,k,nums.length-k);
        System.arraycopy(temp,0,nums,0,k);
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args){
        int [] x = {1,2,3,4,5};


    }
}
