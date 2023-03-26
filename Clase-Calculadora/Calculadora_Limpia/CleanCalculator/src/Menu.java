import java.util.Scanner;


public class Menu {
    public static void main(String[] args){
        // Creamos un objeto de la clase Operaciones
        Constans constans = new Constans();
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
            
            System.out.println(constans.SPACE_STRING);
            System.out.println(constans.WELCOME);
            System.out.println(constans.SPACE_STRING);
            System.out.println(constans.MENU);
            System.out.println(constans.ADD);
            System.out.println(constans.SUB);
            System.out.println(constans.MUL);
            System.out.println(constans.DIV);
            System.out.println(constans.EXIT);
            System.out.println(constans.SPACE_STRING);
            System.out.println(constans.HELP_MESSAGE);
            option = input_menu.nextInt();
            
            if (option == 5) {
                System.out.println(constans.EXIT_MESSAGE);
                break;
            } else {
                switch (option) {
                    case 1:
                        System.out.println(constans.ADD_MESSAGE);

                        int[] numbers_add = calculator.calculate();

                        result = add.add(numbers_add);
                        System.out.println(constans.RESULT + result);
                        break;
                    case 2:
                        System.out.println(constans.SUB_MESSAGE);

                        int[] numbers_sub = calculator.calculate();
                        
                        result = subtract.subtract(numbers_sub);
                        System.out.println(constans.RESULT + result);
                        break;
                    case 3:
                        System.out.println(constans.MUL_MESSAGE);

                        int[] numbers_mul = calculator.calculate();

                        result = multiply.multiply(numbers_mul);
                        System.out.println(constans.RESULT + result);
                        break;
                    case 4:
                        System.out.println(constans.DIV_MESSAGE);

                        int[] numbers_div = calculator.calculate();

                        for (int number : numbers_div) {
                            if (number == 0) {
                                System.out.println(constans.DIVIDE_BY_ZERO);
                                break;
                        } else {
                            result = divide.divide(numbers_div);
                            System.out.println(constans.RESULT + result);
                        }
                        break;
                    }
                    default:
                        System.out.println(constans.INVALID_MESSAGE);
                        break;
                }
            }
        }
    }
}
