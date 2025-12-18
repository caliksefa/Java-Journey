package basic_projects;
import java.util.Scanner;
public class Roots {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double a, b, c, discriminant, sqrtOfDisc , root1, root2;

        System.out.print("Please enter the constant coeffients of equation: a, b and c : ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        discriminant = Math.pow(b, 2.0) - 4*a*c ;
        sqrtOfDisc = Math.sqrt(discriminant);

        if(discriminant > 0 ){
            root1 = (-b + sqrtOfDisc) / (2*a) ;
            root2 = (-b - sqrtOfDisc) / (2*a) ;
            System.out.printf("The roots are " + root1 + " and " + root2);
        }
        else if (discriminant == 0) {
            root1 = -b / (2*a);
            System.out.printf("The root is " + root1);
        }
        else {
            System.out.print("The equation has no real roots");
        }
    }

}
