package Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberToString {
    public static String[] enere = {"en", "to", "tre", "fire", "fem", "seks", "sju", "åtte", "ni", "ti", "elleve", "tolv", "tretten", "fjorten", "femten", "seksten", "søtten", "atten", "nitten"};
    public static String tiere[] = {"ti", "tjue", "tretti", "førti","femti","seksti", "sytti", "åtti", "nitti"};


// 999 999 999
       public static String nineninenine(int x){
        StringBuilder sb = new StringBuilder();
           ArrayList<String> liste = new ArrayList<>();
           if(x % 100 < 20 && x % 100 > 10){
               liste.add(enere[x % 100 - 1]);
               liste.add(enere[x / 100 -1] + " hundre og ");
           }
           else {
               for (int i = 1; i <= 3; i++) {
                   int temp = x % 10;
                   if (i == 1 && temp > 0) {
                       liste.add(enere[x % 10 - 1]);
                   } else if (i == 2 && temp > 0) {
                       liste.add(tiere[x % 10 - 1]);
                   } else if (i == 3 && temp > 0) {
                       liste.add(enere[x % 10 - 1] + " hundre og ");
                   }
                   x = x / 10;
               }
           }
        for(int j = liste.size()-1; j >= 0; j--){
            sb.append(liste.get(j));
        }
        return sb.toString();
    }
    public static String convert(int x){
           int lengde = Integer.toString(x).length();
           StringBuilder sb = new StringBuilder();
           if(lengde > 6){
               sb.append(nineninenine(x / 1000000));
               if(x / 1000000 > 1)sb.append(" millioner ");
               else sb.append(" million ");
               x = x % 1000000;
           }
           if(lengde > 3){
               sb.append(nineninenine(x/1000) + " tusen ");
               x = x % 1000;
           }
           sb.append(nineninenine(x));
           return sb.toString();
    }
    public static void main(String [] args){
       int [] x = new int[100];
        Arrays.setAll(x, (i) -> 1+ i);
        System.out.println(Arrays.toString(x));

    }
}
