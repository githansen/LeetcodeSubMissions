package Arrays;


import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public static void main(String[] args){
        int [] x = {3,2,2,3};
        System.out.println(Arrays.toString(x));
        removeElement(x, 3);
        System.out.println(Arrays.toString(x));
    }
}
