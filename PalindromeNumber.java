import java.util.Objects;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input
        int x = scanner.nextInt();
        // convert

        boolean result = mCalculate(x);
        System.out.println(result);

    }

    private static boolean mCalculate(int x) {
        String s = String.valueOf(x);
        // middle point
        int midpoint = s.length() / 2;

        // arraylist for first half
        String[] arrayList = new String[midpoint];
        for (int j = 0; j < midpoint; j++) {
            arrayList[j] = Character.toString(s.charAt(j));

        }
        for (int j = (midpoint + s.length() % 2); j < s.length(); j++) {

            if (!Objects.equals(arrayList[--midpoint], Character.toString(s.charAt(j)))) {
                return false;
            }
        }

        return true;

    }
}
