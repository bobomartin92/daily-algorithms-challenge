package dailyAlgorithms;

public class ArrayPacking {
    public static long arrayPacking(int[] arr) {

//        Task
//        You are given an array of up to four non-negative integers, each less than 256.
//        Your task is to pack these integers into one number M in the following way:
//
//        The first element of the array occupies the first 8 bits of M;
//        The second element occupies next 8 bits, and so on.
//        Return the obtained integer M as unsigned integer.
//
//        Note:
//        the phrase "first bits of M" refers to the least significant bits of M - the right-most bits of an integer. For further clarification see the following example.
//
//                Example
//        For a = [24, 85, 0], the output should be 21784
//        An array [24, 85, 0] looks like [00011000, 01010101, 00000000] in binary.
//        After packing these into one number we get 00000000 01010101 00011000 (spaces are placed for convenience), which equals to 21784.
//
//        Input/Output
//                [input] integer array a
//        Constraints: 1 ≤ a.length ≤ 4 and 0 ≤ a[i] < 256
//                [output] an unsigned integer

        // Implement me! :)

        StringBuilder str = new StringBuilder();

        for (int i = arr.length -1; i >= 0; i--) {
            str.append(String.format("%8s", Integer.toBinaryString(arr[i])).replaceAll(" ", "0"));
        }

        return Long.parseLong(str.toString(), 2);
    }
}
