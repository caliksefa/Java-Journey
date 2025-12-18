package basic_projects;
import java.util.Scanner ;
public class Calculator {
    public static void main(String[] args) {
        int num1, num2;
        double result = 0.0 ;
        String choice ;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Please enter the second number: ");
        num2 = input.nextInt();

        System.out.print("Please enter your choice: " +
                "(Sum: sum," +
                " Subtract: subtr," +
                " multiply: mult," +
                " division: div): ");
        choice = input.next();
        switch (choice){
            case "sum":
                result = (double)num1 + num2;
                break ;
            case "subtr" :
                result = (double)num1 - num2 ;
                break ;
            case "mult" :
                result = 1.0 ;
                result = (double)num1 * num2 ;
                break ;
            case "div" :
                result = 1.0 ;
                if(num2 == 0.0 ){
                    System.out.print("Invalid number... ERROR");
                    return ;
                }
                result = (double)num1 / num2 ;
                break;
            default:
                System.out.print("Invalid Choice");
                break;
        }

        System.out.printf("Result is %.2f", result);



    }
}
