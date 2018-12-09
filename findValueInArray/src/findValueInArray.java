import java.util.Scanner;

public class findValueInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String input_name = scanner.nextLine();
        if (!isExist(input_name))
            System.out.println("Not found" + input_name + " in the list.");
    }
    private static boolean isExist(String input_name) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                return true;
            }
        }
        return false;
    }
}
