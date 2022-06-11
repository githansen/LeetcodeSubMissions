package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class main {


    // https://leetcode.com/problems/fizz-buzz
    public List<String> fizzBuzz(int n) {

        List<String> liste = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % 15 == 0){
                liste.add("FizzBuzz");
            }
            else if(i % 5 == 0){
                liste.add("Buzz");
            }
            else if(i % 3 == 0){
                liste.add("Fizz");
            }
            else{
                liste.add(Integer.toString(i));
            }
        }

        return liste;
    }
    // https://leetcode.com/problems/roman-to-integer/
    public static int romanToInt(String s) {
        HashMap<Character, Integer> liste = new HashMap<>();
        liste.put('I', 1);
        liste.put('V', 5);
        liste.put('X', 10);
        liste.put('L', 50);
        liste.put('C', 100);
        liste.put('D', 500);
        liste.put('M', 1000);
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if( i< s.length() -1 && liste.get(s.charAt(i)) < liste.get(s.charAt(i+1))){
                sum -= liste.get(s.charAt(i));
            }
            else{
                sum+= liste.get(s.charAt(i));
            }
        }
        return sum;
    }
    public static void main(String [] args){
        HashMap<Character, Integer> liste = new HashMap<>();
        System.out.println(romanToInt("IIV"));

    }
}
