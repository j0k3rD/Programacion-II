public class Add {
    public int add(int... numbers) {
        int add = 0;
        for (int number : numbers) {
            add += number;
        }
        return add;
    }
}
