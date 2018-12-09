import java.util.Scanner;

public class total {
    public static void main(String[] args){
        int edge;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter edge: ");
        edge = scanner.nextInt();



        int[][] A = new int[edge][edge];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < edge; i++) {
            for (int j = 0; j < edge; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        int total = 0;
        for (int i=0; i < edge; i++){
            for (int j=0; j < edge; j++){
                if (i == j){
                    total = total + A[i][j];
                }
            }
        }

        System.out.print("Total of main diagonal is: " + total);
    }
}
