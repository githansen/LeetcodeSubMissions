package Strings.Easy;

import java.util.Arrays;

public class Easy {
    // https://leetcode.com/problems/longest-common-prefix
    public String longestCommonPrefix(String[] strs) {
        String common = "";
        boolean comm = true;
        Arrays.sort(strs, (s1, s2) ->{
            return s1.length() -s2.length();
        });
        System.out.println(Arrays.toString(strs));
        for(int i = 0; i < strs[0].length(); i++){
            char d = strs[0].charAt(i);
            for(int j = 0; j < strs.length; j++){
                if(strs[j].charAt(i) != d){
                    comm = false;
                    break;
                }
            }
            if(comm)common+= strs[0].charAt(i);
        }


        return common;
    }
    public static void main(String [] args){
        String [] x = {"Hei", "Nei"};
        Arrays.sort(x, (x1,x2) ->{
            return x1.length() - x2.length();
        });
    }
}
