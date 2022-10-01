package dailyAlgorithms;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TwoToOne {

//    Two to Two
//
//    Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.
//
//            Examples:
//    a = "xyaabbbccccdefww"
//    b = "xxxxyyyyabklmopq"
//    longest(a, b) -> "abcdefklmopqwxy"
//
//    a = "abcdefghijklmnopqrstuvwxyz"
//    longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"


    public static String longest (String s1, String s2) {
        // your code

        Set<Character> hs1 = new HashSet<Character>();

        for(int i = 0; i < s1.length(); i++){
            hs1.add(s1.charAt(i));
        }

        for(int i = 0; i < s2.length(); i++){
            hs1.add(s2.charAt(i));
        }

        TreeSet arr = new TreeSet(hs1);

        String res = "";

        for(Object c: arr){
            res += c;
        }

        return res;
    }
}
