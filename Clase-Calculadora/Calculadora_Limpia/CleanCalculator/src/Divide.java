public class Divide {
    public float divide(int... numbers) {
        float divide = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            divide /= numbers[i];
        }
        return divide;
    }
}
