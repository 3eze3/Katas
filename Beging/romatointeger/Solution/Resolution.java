import java.util.Map;

public class Resolution {
    public int romanToInteger(String s) {
        Map<Character, Integer> romamNumbers = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        int numberInteger = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentvalue = romamNumbers.get(s.charAt(i));
            if (i + 1 < s.length()) {
                int nexValue = romamNumbers.get(s.charAt(i + 1));
                if (currentvalue < nexValue) {
                    numberInteger += nexValue - currentvalue;
                    i++;
                    continue;
                }
            }
            numberInteger += currentvalue;
        }
        return numberInteger;
    }
}
