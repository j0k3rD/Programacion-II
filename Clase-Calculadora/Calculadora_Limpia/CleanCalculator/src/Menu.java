import java.util.Scanner;


public class Menu {
    public static void main(String[] args){
        // Creamos un objeto de la clase Operaciones
        Calculator calculator = new Calculator();
        Add add = new Add();
        Sub subtract = new Sub();
        Multiply multiply = new Multiply();
        Divide divide = new Divide();

        Scanner input_menu = new Scanner(System.in); // Create a Scanner object


        float result;
        int option;
        boolean op=true;

        while (op) {
            
            System.out.println(Constants.SPACE_STRING);
            System.out.println(Constants.WELCOME);
            System.out.println(Constants.SPACE_STRING);
            System.out.println(Constants.MENU);
            System.out.println(Constants.ADD);
            System.out.println(Constants.SUB);
            System.out.println(Constants.MUL);
            System.out.println(Constants.DIV);
            System.out.println(Constants.EXIT);
            System.out.println(Constants.SPACE_STRING);
            System.out.println(Constants.HELP_MESSAGE);
            option = input_menu.nextInt();
            
            if (option == 5) {
                System.out.println(Constants.EXIT_MESSAGE);
                break;
            } else {
                switch (option) {
                    case 1:
                        System.out.println(Constants.ADD_MESSAGE);

                        int[] numbers_add = calculator.calculate();

                        result = add.add(numbers_add);
                        System.out.println(Constants.RESULT + result);
                        break;
                    case 2:
                        System.out.println(Constants.SUB_MESSAGE);

                        int[] numbers_sub = calculator.calculate();
                        
                        result = subtract.subtract(numbers_sub);
                        System.out.println(Constants.RESULT + result);
                        break;
                    case 3:
                        System.out.println(Constants.MUL_MESSAGE);

                        int[] numbers_mul = calculator.calculate();

                        result = multiply.multiply(numbers_mul);
                        System.out.println(Constants.RESULT + result);
                        break;
                    case 4:
                        System.out.println(Constants.DIV_MESSAGE);

                        int[] numbers_div = calculator.calculate();

                        boolean zero = false;
                        for (int number : numbers_div) {
                            if (number == 0) {
                                System.out.println(Constants.DIVIDE_BY_ZERO);
                                zero = true;
                                break;
                            }
                        }
                        if (!zero) {
                            result = divide.divide(numbers_div);
                            System.out.println(Constants.RESULT + result);
                        }
                        break;  
                    default:
                        System.out.println(Constants.INVALID_MESSAGE);
                        break;
                }
            }
        }
    }
}
