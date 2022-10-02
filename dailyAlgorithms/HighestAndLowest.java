package dailyAlgorithms;

public class HighestAndLowest {

//    Highest and Lowest
//    In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
//
//    Examples
//    highAndLow("1 2 3 4 5")  // return "5 1"
//    highAndLow("1 2 -3 4 5") // return "5 -3"
//    highAndLow("1 9 3 4 -5") // return "9 -5"

    public static String highAndLow(String numbers) {
        // Code here or

        String[] arr = numbers.split(" ");

        if (arr.length == 1){
            return arr[0] + " " + arr[0];
        }

        int lowest = Integer.parseInt(arr[0]);
        int highest = Integer.parseInt(arr[0]);

        for(String n: arr){
            if (lowest > Integer.parseInt(n)) lowest = Integer.parseInt(n);

            if (highest < Integer.parseInt(n)) highest = Integer.parseInt(n);
        }
        return highest + " " + lowest;
    }
}
