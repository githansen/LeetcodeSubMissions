package Math;

public class Easy {
    // https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
    public int subtractProductAndSum(int n) {
        return product(n) - sum(n);
    }

    public int product(int n){
        if(n == 0)return 1;
        return n%10 *product(n/10);
    }
    public int sum(int n){
        if(n == 0) return 0;
        return n%10+sum(n/10);
    }
}
