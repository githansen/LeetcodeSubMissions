package Arrays;


import javax.swing.tree.TreeNode;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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


   // https://leetcode.com/problems/plus-one
    public int[] plusOne(int[] digits) {
        int last = digits.length-1;
        if(digits[last] != 9){
            digits[last] = digits[last] +1;
            return digits;
        }
        while( last >= 0 && digits[last] == 9){
            last--;
        }
        if(last > -1){
            digits[last] ++;
            for(int i = last+1; i < digits.length; i++){
                digits[i] = 0;

            }
            return digits;
        }
        else{
            int [] ret = new int[digits.length +1];
            ret[0] = 1;
            for(int i = 1; i < digits.length; i++){
                ret[i] = 0;
            }
            return ret;
        }

    }

    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    public int maxProfit(int[] prices) {
        int max = 0;
        int min=prices[0];
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min) min=prices[i];
            if(prices[i] - min > max) max = prices[i] - min;
        }
        return max;
    }
    // https://leetcode.com/problems/single-number
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean finnes = false;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) finnes = true;
            }
            if (!finnes) return nums[i];
        }
        return 0;
    }

    // https://leetcode.com/problems/binary-tree-inorder-traversal/
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> liste = new ArrayList<>();
        if(root == null) return liste;
        inorder(liste, root);
        return liste;
    }
    public void inorder(List<Integer> liste, TreeNode node){
        if(node == null) return;
      //  inorder(liste, node.left);
        //liste.add(node.value);
       // inorder(liste, node.right);
    }

        // https://leetcode.com/problems/shuffle-the-array
    public int[] shuffle(int[] nums, int n) {
        int [] temp = new int[nums.length];
        int j = 0; int i = 0;
        while(i < n && j < nums.length){
            temp[j] = nums[i];
            temp[j+1] = nums[n];
            j+=2;
            n++;
            i++;
        }
        return temp;
    }
    // https://leetcode.com/problems/number-of-good-pairs
    public int numIdenticalPairs(int[] nums) {
        int sum=0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j])sum++;
            }
        }
        return sum;
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

    //https://leetcode.com/problems/flipping-an-image/
    public int[][] flipAndInvertImage(int[][] image) {

        for(int i=0; i < image.length; i++){
            flip(image, i);
        }
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[i].length; j++){
                if(image[i][j] == 0) image[i][j]=1;
                else image[i][j]=0;
            }
        }

        return image;
    }
    public void flip(int [][] image, int j){
        int n = image.length -1;
        for(int i = 0; i < n; i++){
            int temp = image[j][i];
            image[j][i] = image[j][n];
            image[j][n]=temp;
            n--;
        }
    }

    // https://leetcode.com/problems/contains-duplicate/
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> liste = new HashSet<>();
        for(int i : nums) liste.add(i);

        return liste.size() != nums.length;
    }
    // https://leetcode.com/problems/merge-sorted-array/
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] temp = new int[m+n];
        System.arraycopy(nums1, 0, temp, 0, m);
        System.arraycopy(nums2, 0, temp, m, n);
        System.out.println(Arrays.toString(temp));
        int i = 0;
        int j = m;
        int k = 0;
        while(i < m && j < n+m){
            if(temp[i] <= temp[j]){
                nums1[k++] = temp[i++];
            }
            else{
                nums1[k++] = temp[j++];
            }
        }
        while(i < m){
            nums1[k++] = temp[i++];
        }
        while(j<n+m) nums1[k++] = temp[j++];

    }
        // https://leetcode.com/problems/move-zeroes/
        public void moveZeroes(int[] nums) {
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0){
                    for(int j = i+1; j < nums.length; j++){
                        if(nums[j] != 0){
                            swap(nums, i, j);
                            break;
                        }
                    }
                }
            }
        }
        public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
         }

         // https://leetcode.com/problems/find-smallest-letter-greater-than-target/
         public char nextGreatestLetter(char[] letters, char target) {
             int i = 0;
             while(i < letters.length && letters[i] <= target){
                 i++;
             }
             if(i >= letters.length) return letters[0];
             else return letters[i];
         }
         // https://leetcode.com/problems/median-of-two-sorted-arrays
         public double findMedianSortedArrays(int[] nums1, int[] nums2) {
             int [] temp = new int[nums1.length + nums2.length];
             int i = 0;
             int j = 0;
             int k = 0;
             while(i < nums1.length && j < nums2.length){
                 if(nums1[i] <= nums2[j]){
                     temp[k++] = nums1[i++];
                 }
                 else temp[k++] = nums2[j++];
             }
             while(i < nums1.length)temp[k++] = nums1[i++];
             while(j < nums2.length) temp[k++] = nums2[j++];
             System.out.println(Arrays.toString(temp));
             if(temp.length % 2 == 0){
                 return (double) (temp[temp.length/2] + temp[ temp.length/2 -1] )/2;
             }
             else{
                 return temp[temp.length/2];
             }
         }

    public static void main(String[] args){

    }
}
