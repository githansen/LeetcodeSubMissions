package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class Medium {
    //binsøk -> https://leetcode.com/problems/binary-search
    public int search(int[] nums, int target) {
        int v = 0;
        int h = nums.length-1;
        while(v<=h){
            int m = (v+h)/2;
            if(nums[m] == target)return m;
            else if (nums[m] > target){
                h = m-1;
            }
            else v = m+1;
        }
        return -1;
    }
    //https://leetcode.com/problems/sqrtx/
    public int mySqrt(int x) {
        if(x==1)return 1;
        for(long i = 1; i <= x; i++){
            if(i * i > x){
                return (int)i-1;
            }

        }
        return 0;
    }
    // https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List <Boolean> liste = new ArrayList<>();
        int max = 0;
        for(int i: candies){
            if(i > max) max = i;
        }
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= max){
                liste.add(true);
            }
            else liste.add(false);
        }
        return liste;
    }

}
