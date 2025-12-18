package basic_projects;
import java.util.Scanner ;
public class StudentCard {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, surname;
        double length;
        boolean isStudent;

        System.out.println("Welcome to program bro!");
        System.out.print("Please enter your name for your student card: ");
        name = input.nextLine();
        System.out.print("Please enter your surname for your student card: ");
        surname = input.nextLine();
        System.out.print("Please enter your length for your student card: ");
        length = input.nextDouble();
        System.out.print("Please enter that you are student or not (true / false): ");
        isStudent = input.nextBoolean();
        System.out.printf("Name: %s\nSurname: %s\nLength: %.2f\nIs Student: %b\n"
                , name, surname, length, isStudent);

    }


}
