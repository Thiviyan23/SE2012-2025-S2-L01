import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your First Name: ");
        String FirstName = scanner.nextLine();

        System.out.print("Enter your Last Name: ");
        String LastName = scanner.nextLine();

         System.out.println("Welcome to the second year " + FirstName + " " + LastName);

         scanner.close();
    }
}