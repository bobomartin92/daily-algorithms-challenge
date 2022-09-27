package dailyAlgorithms;

public class HasUnique {
    public static boolean hasUnique(String str) {

        String[] arr = str.split("");

        for (String i : arr) {
            if (str.indexOf(i) != str.lastIndexOf(i))
                return false;
        }

        return true;
    }
}
