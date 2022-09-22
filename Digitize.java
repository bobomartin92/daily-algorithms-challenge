public class Digitize {

//    Convert number to reversed array of digits
//    Given a random non-negative number, you have to return
//    the digits of this number within an array in reverse order.
//
//            Example(Input => Output):
//            35231 => [1,3,2,5,3]
//            0 => [0]


    public static int[] digitize(long n) {
        // Code here

        String str = String.valueOf(n);

        int len = str.length();

        int nums[] = new int[len];
        int j = 0;

        for(int i = str.length() - 1; i >= 0; i--){

            nums[j] = Character.getNumericValue(str.charAt(i));
            j++;

        }
        return nums;
    }
}
