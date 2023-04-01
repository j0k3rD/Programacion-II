import java.util.Scanner;


public class Calculator {

    public int[] toIntArray(String input) {
        String[] numbers_string = input.split(Constants.SPACE);
        int[] numbers_int = new int[numbers_string.length];
        for (int i = 0; i < numbers_string.length; i++) {
            numbers_int[i] = Integer.parseInt(numbers_string[i]);
        }
        return numbers_int;
    }

    public int add(int... numbers) {
        int add = 0;
        for (int number : numbers) {
            add += number;
        }
        return add;
    }

    public int subtract(int... numbers) {
        int subtract = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            subtract -= numbers[i];
        }
        return subtract;
    }

    public int multiply(int... numbers) {
        int multiply = 1;
        for (int number : numbers) {
            multiply *= number;
        }
        return multiply;
    }

    public float divide(int... numbers) {
        float divide = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            divide /= numbers[i];
        }
        return divide;
    }

    public String calculate(int option) {
        Scanner input_numbers = new Scanner(System.in);
        int[] numbers;
        switch (option) {
            case 1:
                System.out.println(Constants.ADD_MESSAGE);
                numbers = toIntArray(input_numbers.nextLine());
                return Constants.RESULT + add(numbers);
            case 2:
                System.out.println(Constants.SUB_MESSAGE);
                numbers = toIntArray(input_numbers.nextLine());
                return Constants.RESULT + subtract(numbers);
            case 3:
                System.out.println(Constants.MUL_MESSAGE);
                numbers = toIntArray(input_numbers.nextLine());
                return Constants.RESULT + multiply(numbers);
            case 4:
                System.out.println(Constants.DIV_MESSAGE);
                numbers = toIntArray(input_numbers.nextLine());
                boolean zero = false;
                for (int number : numbers) {
                    if (number == 0) {
                        return Constants.DIVIDE_BY_ZERO;
                    }
                }
                return Constants.RESULT + divide(numbers);
            case 5:
                return Constants.EXIT_MESSAGE;
            default:
                return Constants.INVALID_MESSAGE;
        }
    }
}