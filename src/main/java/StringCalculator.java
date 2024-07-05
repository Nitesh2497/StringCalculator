import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.length() < 2) {
            if (numbers.isEmpty()) {
                return 0;
            } else {
                return Integer.valueOf(numbers);
            }
        } else {

            String delimiter = ",|\n";
            String numberString = numbers;

            if (numbers.startsWith("//")) {
                int delimiterIndex = numbers.indexOf('\n');
                delimiter = numbers.substring(2, delimiterIndex);
                numberString = numbers.substring(delimiterIndex + 1);
            }

            String[] number = numberString.split(delimiter);
            return sum(number);
        }
    }

    private int sum(String[] numbers) {
        int sum = 0;
        StringBuilder negativeString = new StringBuilder();

        for (String number : numbers) {
            if (Integer.valueOf(number) < 0) {
                if (negativeString.toString().equals(""))
                    negativeString = new StringBuilder(number);
                else
                    negativeString.append(",").append(number);
            } else {
                sum += Integer.valueOf(number);
            }
        }
            if (!negativeString.toString().equals("")) {
                throw new IllegalArgumentException("Negatives not allowed " + negativeString);
            }

        return sum;
    }
}
