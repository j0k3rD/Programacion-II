import java.util.Scanner;


public class Calculator {

    public int[] calculate(int... numbers) {

        Scanner input_numbers = new Scanner(System.in);

        String[] numbers_string = input_numbers.nextLine().split(Constants.SPACE);
                        
        int[] numbers_int = new int[numbers_string.length];
        for (int i = 0; i < numbers_string.length; i++) {
            numbers_int[i] = Integer.parseInt(numbers_string[i]);
        }

        return numbers_int;
    }
}
