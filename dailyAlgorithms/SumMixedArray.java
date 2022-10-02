package dailyAlgorithms;

import java.util.List;

public class SumMixedArray {

//    Sum Mixed Array
//
//    Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
//
//    Return your answer as a number.



    /*
     * Assume input will be only of Integer o String type
     */
    public int sum(List<?> mixed) {
        int sum = 0;
        for(var i : mixed){
            if (i instanceof Integer){
                sum += (int) i;
                continue;
            }
            sum += Integer.parseInt((String) i);
        }
        return sum;
    }
}
