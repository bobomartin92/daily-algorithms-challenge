package dailyAlgorithms;

public class CalculateAverage {
//    Calculate average
//
//    Write a function which calculates the average of the numbers in a
//    given list.
//
//    Note: Empty arrays should return 0.



    public static double find_average(int[] array){
        if (array.length == 0) return 0;
        double sum = 0;

        for (int n: array){
            sum += n;
        }

        return sum / array.length;
    }
}
