package dailyAlgorithms;

public class Grow {
//    Beginner - Reduce but src.Grow
//    Given a non-empty array of integers, return the result of
//    multiplying the values together in order.
//
//            Example:
//            [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24

    public static int grow(int[] x){

        int res = 1;

        for (int i : x){
            res *= i;
        }
        return res;

    }
}
