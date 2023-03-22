public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOperation(1);
        System.out.println(calculator.add(1, 2, 3, 4, 5));
        calculator.setOperation(2);
        System.out.println(calculator.subtract(1, 2, 3, 4, 5));
        calculator.setOperation(3);
        System.out.println(calculator.multiply(1, 2, 3, 4, 5));
        calculator.setOperation(4);
        System.out.println(calculator.divide(1, 2, 3, 4, 5));
        calculator.setOperation(5);
        System.out.println(calculator.getOperation(1, 2, 3, 4, 5));
    }
}
