import java.util.Scanner;

public class totalOfColumn {
    public static void main(String[] args) {
        int line, column, sequence;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter line: ");
        line = scanner.nextInt();
        System.out.println("Enter column: ");
        column = scanner.nextInt();


        double[][] A = new double[line][column];

        System.out.println("Enter element: ");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("Enter sequence number of the column: ");
        sequence = scanner.nextInt();

        if (sequence < 0 || sequence > column) {
            System.out.print("Error!");
        }
        else {
            double total = 0;
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < column; j++) {
                    if (j == sequence) {
                        total = total + A[i][j];
                    }
                }
            }

            System.out.print("Total of column " + sequence + "is: " + total);
        }

    }
}
