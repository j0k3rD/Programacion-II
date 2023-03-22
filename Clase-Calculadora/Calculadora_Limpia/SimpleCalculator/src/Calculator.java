public class Calculator {
    
    public int add(int... numbers) {
        int add = 0;
        for (int number : numbers) {
            add += number;
        }
        return add;
    }

    public int subtract(int... numbers) {
        int subtract = 0;
        for (int number : numbers) {
            subtract -= number;
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

    public int divide(int... numbers) {
        int divide = 1;
        for (int number : numbers) {
            divide /= number;
        }
        return divide;
    }

    public int getOperation(int... numbers) {
        int operation = 0;
        for (int number : numbers) {
            operation = number;
        }
        return operation;
    }

    public void setOperation(int operation) {
        switch (operation) {
            case 1:
                System.out.println("Addition");
                break;
            case 2:
                System.out.println("Subtraction");
                break;
            case 3:
                System.out.println("Multiplication");
                break;
            case 4:
                System.out.println("Division");
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
    
}
