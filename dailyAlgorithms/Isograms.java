package dailyAlgorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Isograms {
//    Isograms
//    An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.
//
//    Example: (Input --> Output)
//    "Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

    public static boolean  isIsogram(String str) {
        // ...

        String lower = str.toLowerCase();

        String[] arr = lower.split("");

        Set<String> unique = new HashSet<>(Arrays.asList(arr));

        return arr.length == unique.size();
    }
}
