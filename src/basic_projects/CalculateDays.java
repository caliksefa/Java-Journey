package basic_projects;
import java.util.Scanner ;
public class CalculateDays {
    public static void main(String[] args) {
        String month;
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        year = input.nextInt();
        input.nextLine();
        System.out.print("Please enter the month: ");
        month = input.nextLine();

        switch (month){
            case "January" :
            case "March" :
            case "May" :
            case "July" :
            case "August" :
            case "October" :
            case "December" :
                System.out.printf("%s %d has 31 days", month, year);
                break;
            case "February" :
                if(year % 4 == 0 ){
                    System.out.printf("%s %d has 29 days", month, year);
                }
                else {
                    System.out.printf("%s %d has 28 days", month, year);
                }
                break ;
            case "April" :
            case "June" :
            case "September":
            case "November" :
                System.out.printf("%s %d has 30 days", month, year);
                break;
            default:
                System.out.print("You entered unvalid input");
        }
    }
}
