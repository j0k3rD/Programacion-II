import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Calculator
        Calculator calculator = new Calculator();

        Scanner input_menu = new Scanner(System.in); // Create a Scanner object

        int option;
        boolean op=true;

        while (op) {

            System.out.println(Constants.SPACE_STRING + "\n" + Constants.WELCOME + "\n" + Constants.SPACE_STRING + "\n" + Constants.MENU + "\n" + Constants.ADD + "\n" + Constants.SUB + "\n" + Constants.MUL + "\n" + Constants.DIV + "\n" + Constants.EXIT + "\n" + Constants.SPACE_STRING + "\n" + Constants.HELP_MESSAGE);
            option = input_menu.nextInt();

            System.out.println(calculator.calculate(option));

            if (option == 5) {
                System.out.println(Constants.EXIT_MESSAGE);
                break;
            }
        }
    }
}