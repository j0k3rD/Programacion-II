public class Sub {
    public int subtract(int... numbers) {
        int subtract = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                subtract -= numbers[i];
            }
        return subtract;
    }
}
