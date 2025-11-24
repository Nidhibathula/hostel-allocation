import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();
        RoomService roomService = new RoomService();

        while (true) {
            System.out.println("\n===== Hostel Room Allocation System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Allocate Room");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();

                    Student s = new Student(id, name, branch);
                    studentService.addStudent(s);
                    break;

                case 2:
                    System.out.print("Enter Student ID: ");
                    int studentId = sc.nextInt();

                    Student found = studentService.getStudentById(studentId);
                    if (found == null) {
                        System.out.println("Student not found!");
                    } else {
                        Room room = roomService.allocateRoom();
                        if (room == null)
                            System.out.println("No rooms available!");
                        else
                            System.out.println("Room " + room.getRoomNumber() + " allocated to " + found.getName());
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}