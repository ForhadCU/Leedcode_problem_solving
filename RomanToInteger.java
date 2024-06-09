import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt(String s) {
        // output sum
        int sum = 0;
        // map to store integer values according to Romans
        HashMap<String, Integer> hMap = new HashMap<>();
        // current index's Integer digit
        int currentID;
        // next index's Integer digit
        int nextID;

        // place all the value in hashmap as Romans are key and Intergers are values

        hMap.put("I", 1);
        hMap.put("V", 5);
        hMap.put("X", 10);
        hMap.put("L", 50);
        hMap.put("C", 100);
        hMap.put("D", 500);
        hMap.put("M", 1000);

        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                sum = sum + hMap.get(Character.toString(s.charAt(i)));

            } else {
                currentID = hMap.get(Character.toString(s.charAt(i)));
                nextID = hMap.get(Character.toString(s.charAt(i + 1)));
                // for normal case of Roman DIGIT sequence
                if (currentID >= nextID) {
                    sum += currentID;
                }
                // for exceptional case of Roman DIGIT sequence such as IV, XL..
                else {
                    sum += (nextID - currentID);
                    // skip the next index
                    i++;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        String s = "III";
        int output = romanToInteger.romanToInt(s);
        System.out.println(output);

    }
}
