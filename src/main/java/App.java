import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        for (Integer number : new App().getHappyRange(1, 1000)) {
            System.out.println(number);
        }
    }

    public Integer[] numberToDigits(Integer number) {
        String str = Integer.toString(number);
        int strLen = str.length();
        Integer[] digits = new Integer[strLen];
        for (int i = 0; i < strLen; i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    public Integer[] squareDigits(Integer[] digits) {
        Integer[] squaredDigits = new Integer[digits.length];
        for (int i = 0; i < digits.length; i++) {
            squaredDigits[i] = digits[i] * digits[i];
        }
        return squaredDigits;
    }

    public Integer sumDigits(Integer[] digits) {
        Integer sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i]; 
        }
        return sum;
    }

    public Boolean isHappy(Integer number) {
        if (number == 1) {
            return true;
        } else if (number == 4) {
            return false;
        } else {
            Integer[] digits = numberToDigits(number);
            Integer happyNumber = sumDigits(squareDigits(digits));
            return isHappy(happyNumber);
        }
    }

    public ArrayList<Integer> getHappyRange(Integer start, Integer end) {
        ArrayList<Integer> range = new ArrayList<Integer>();

        for (int i = start; i <= end; i++) {
            if (isHappy(i)) {
                range.add(i);
            }
        }

        return range;
    }
}
