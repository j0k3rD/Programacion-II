public class Multiply {
    public int multiply(int... numbers) {
        int multiply = 1;
        for (int number : numbers) {
            multiply *= number;
        }
        return multiply;
    }
}
