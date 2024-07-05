
public class StringCalculator {

    public int add(String numbers){
        if(numbers.length()<2) {
            if (numbers.isEmpty()) {
                return 0;
            } else {
                return Integer.valueOf(numbers);
            }
        }else{
            String[] number = numbers.split("[,\n]");
            int sum = 0;
            for (String num : number) {
                sum += Integer.valueOf(num.trim());
            }
            return sum;
        }
    }
}
