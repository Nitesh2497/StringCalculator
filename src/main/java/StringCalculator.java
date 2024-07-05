import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String numbers){
        if(numbers.length()<2) {
            if (numbers.isEmpty()) {
                return 0;
            } else {
                return Integer.valueOf(numbers);
            }
        }else{

            String delimiter = ",|\n";
            String numberString = numbers;

            if (numbers.startsWith("//")) {
                int delimiterIndex = numbers.indexOf('\n');
                delimiter = numbers.substring(2, delimiterIndex);
                numberString = numbers.substring(delimiterIndex + 1);
            }

            String[] number = numberString.split(delimiter);
            int sum = 0;
            for (String num : number) {
                sum += Integer.valueOf(num.trim());
            }
            return sum;
        }
    }
}
