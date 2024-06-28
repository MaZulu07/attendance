import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AttendanceRegister register = new AttendanceRegister();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Sign Attendance");
            System.out.println("2. Display Attendance");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter worker name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter worker ID: ");
                    String id = scanner.nextLine();
                    Worker worker = new Worker(name, id);
                    Attendance attendance = new Attendance(worker);
                    register.addAttendance(attendance);
                    System.out.println("Attendance signed!");
                    break;
                case 2:
                    register.displayAttendances();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
