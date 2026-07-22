import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students (n): ");
        int n = sc.nextInt();

        double[][] marks = new double[n + 1][3];

        while (true) {
            System.out.println("\nMENU");
            System.out.println("1. Add student marks");
            System.out.println("2. Update student mark");
            System.out.println("3. Get average for a subject");
            System.out.println("4. Get average for a student");
            System.out.println("5. Get total mark of a student");
            System.out.println("6. View grades summary table");
            System.out.println("7. Exit");
            System.out.print("Choose an option (1-7): ");

            int choice = sc.nextInt();

            if (choice == 7) {
                System.out.println("Exiting program.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id1 = sc.nextInt();
                    System.out.print("Enter Math mark: ");
                    marks[id1][0] = sc.nextDouble();
                    System.out.print("Enter Chemistry mark: ");
                    marks[id1][1] = sc.nextDouble();
                    System.out.print("Enter Physics mark: ");
                    marks[id1][2] = sc.nextDouble();
                    System.out.println("Marks added!");
                    break;

                case 2:
                    System.out.print("Enter Student ID: ");
                    int id2 = sc.nextInt();
                    System.out.print("Enter Subject ID (1=Math, 2=Chem, 3=Phys): ");
                    int subId = sc.nextInt();
                    System.out.print("Enter new mark: ");
                    marks[id2][subId - 1] = sc.nextDouble();
                    System.out.println("Mark updated!");
                    break;

                case 3:
                    System.out.print("Enter Subject ID (1=Math, 2=Chem, 3=Phys): ");
                    int sub = sc.nextInt();
                    double subjectSum = 0;
                    for (int i = 1; i <= n; i++) {
                        subjectSum += marks[i][sub - 1];
                    }
                    System.out.println("Subject Average: " + (subjectSum / n));
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int id4 = sc.nextInt();
                    double studentSum = marks[id4][0] + marks[id4][1] + marks[id4][2];
                    System.out.println("Student Average: " + (studentSum / 3.0));
                    break;

                case 5:
                    System.out.print("Enter Student ID: ");
                    int id5 = sc.nextInt();
                    double total = marks[id5][0] + marks[id5][1] + marks[id5][2];
                    System.out.println("Total Marks: " + total);
                    break;

                case 6:
                    System.out.println("\nGRADES SUMMARY");
                    System.out.printf("%-12s %-12s %-12s %-12s\n", "StudentID", "Math", "Chemistry", "Physics");

                    for (int i = 1; i <= n; i++) {
                        String mathGrade = getGrade(marks[i][0]);
                        String chemGrade = getGrade(marks[i][1]);
                        String physGrade = getGrade(marks[i][2]);

                        System.out.printf("%-12d %-12s %-12s %-12s\n", i, mathGrade, chemGrade, physGrade);
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
        sc.close();
    }

    public static String getGrade(double score) {
        if (score >= 90) {
            return "Grade A";
        } else if (score >= 80) {
            return "Grade B";
        } else if (score >= 70) {
            return "Grade C";
        } else if (score >= 60) {
            return "Grade D";
        } else {
            return "Fail";
        }
    }
}
