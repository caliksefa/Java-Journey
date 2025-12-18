package basic_projects;
import java.util.Scanner ;
public class PINchecker {
    public static void main(String[] args) {
        int correctPin = 1234 ;
        int pinTry ;
        int chance = 3 ;
        int count = 0 ;
        System.out.println("Welcome to blogsite...");
        Scanner input = new Scanner(System.in);
        do {
        System.out.print("Plase enter the password: ");
        pinTry = input.nextInt();
        if(pinTry == correctPin){
            System.out.println("Correct PIN. Entering the blogsite...");
            break;
        }
        else {
            System.out.println("Wrong Enterence...");
        }
        count++ ;
        }while(count < chance);

        if(count == 3){
            System.out.print("Your chance is over... Enterence was prevented!!!");
        }
    }
}
