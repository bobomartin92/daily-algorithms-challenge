package dailyAlgorithms;

public class ReverseWords {
//    Reverse words
//    Complete the function that accepts a string parameter, and reverses each word in the string.
//    All spaces in the string should be retained.
//
//    Examples
//    "This is an example!" ==> "sihT si na !elpmaxe"
//    "double  spaces"      ==> "elbuod  secaps"

    public static String reverseWords(final String original)
    {
        // Have at it
        if (original.length() > 0 && original.charAt(0) == ' '){
            return original;
        }

        String[] words = original.split(" ");
        String[] resArr = new String[words.length];

        for (int i = 0; i < words.length; i++){
            StringBuilder str = new StringBuilder(words[i]);
            resArr[i] = str.reverse().toString();
        }

        return String.join(" ", resArr);
    }
}
