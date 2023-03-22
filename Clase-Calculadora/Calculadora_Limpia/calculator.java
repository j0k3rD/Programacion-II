import java.util.List;

interface IOperation {
    float calculate(List<Float> numbers);
}

class Sum implements IOperation {
    public float calculate(List<Float> numbers) {
        float result = 0;
        for (float number : numbers) {
            result += number;
        }
        return result;
    }
}

class Subtraction implements IOperation {
    public float calculate(List<Float> numbers) {
        float result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            result -= numbers.get(i);
        }
        return result;
    }
}

class Multiplication implements IOperation {
    public float calculate(List<Float> numbers) {
        float result = 1;
        for (float number : numbers) {
            result *= number;
        }
        return result;
    }
}

class Division implements IOperation {
    public float calculate(List<Float> numbers) {
        float result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            result /= numbers.get(i);
        }
        return result;
    }
}

class Calculator {
    private IOperation operation;

    public void setOperation(IOperation operation) {
        this.operation = operation;
    }

    public float calculate(List<Float> numbers) {
        return operation.calculate(numbers);
    }
}

public class calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOperation(new Sum());
        System.out.println(calculator.calculate(List.of(1f, 2f, 3f)));
        calculator.setOperation(new Subtraction());
        System.out.println(calculator.calculate(List.of(1f, 2f, 3f)));
        calculator.setOperation(new Multiplication());
        System.out.println(calculator.calculate(List.of(1f, 2f, 3f)));
        calculator.setOperation(new Division());
        System.out.println(calculator.calculate(List.of(1f, 2f, 3f)));
    }
}