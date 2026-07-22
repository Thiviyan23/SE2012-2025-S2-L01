import java.util.scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your First Name: ");
        String FirstName = scanner.nextline();

        System.out.print("Enter your Last Name: ");
        String LastName = scanner.nextline();

         System.out.println("Welcome to the second year"+ FirstName + " " + LastName);

         Scanner.close();
    }
}