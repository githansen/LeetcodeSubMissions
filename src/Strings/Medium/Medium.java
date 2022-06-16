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
        while(k <0) k+= nums.length;
        int[] temp = new int[nums.length];
        System.arraycopy(nums, nums.length-k, temp, 0, k);
        System.arraycopy(nums,0,nums,k,nums.length-k);
        System.arraycopy(temp,0,nums,0,k);
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(nums));
    }
//https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public int lengthOfLongestSubstring(String s) {

        int longest = 0;
        int x [] = new int[256];
        Arrays.setAll(x, i-> i=0);
        int antall;
        for(int i = 0; i < s.length(); i++){
            antall = 0;
            for(int j = i; j < s.length(); j++){
                if(x[s.charAt(j)] == 0){
                    x[s.charAt(j)] += 1;
                    antall++;
                }

                else{
                    break;
                }
            }
            Arrays.setAll(x, t-> t=0);
            if(antall > longest) longest = antall;
        }
        return longest;
    }
    // DENNE BLE INEFFEKTIV, GJØR PÅ NYTT SENERE: https://leetcode.com/problems/permutation-in-string/
    public boolean checkInclusion(String s1, String s2) {
        int len = s1.length();
        int [] x = new int[128];
        Arrays.setAll(x, i -> i = 0);
        for(int i=0; i < s2.length(); i++){
            int antall = 0;
            for(int k = 0; k < len; k++){
                x[s1.charAt(k)]++;
            }
            for(int j = i; j<s2.length() && j < i+len; j++){
                x[s2.charAt(j)]--;
            }
            for(int m = 0; m < x.length; m++){
                if(x[m] > 0) antall++;
            }
            Arrays.setAll(x,n -> n=0);
            if(antall == 0) return true;
        }
        return false;
    }
    public static void main(String[] args){
        int [] x = {1,2,3,4,5};
        rotate(x, -2);

    }
}
