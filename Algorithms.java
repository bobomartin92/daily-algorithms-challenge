public class Algorithms {
    public static String reversedString(String str) {
        // Your code here...

        char[] charArr = str.toCharArray();

        String res = "";

        for (int i = charArr.length - 1; i >= 0; i--){
            res += charArr[i];
        }

        return res;
    }
}
