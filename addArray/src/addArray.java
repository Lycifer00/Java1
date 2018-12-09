import java.util.Arrays;
import java.util.Scanner;

public class addArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        int[] A = new int[5];
        int[] B = new int[6];
        int[] C = new int[A.length + B.length];

        System.out.println("Enter element1: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "]");
            A[i] = sc.nextInt();
            //A[i] = i;
        }

        System.out.println("Enter element2: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print("B[" + i + "]");
            B[i] = sc.nextInt();
            //B[i] = i;
        }

        for (int j = 0; j < A.length; j++) {
            C[index] = A[j];
            index++;
        }
        for (int j = C[B.length]; j < B.length; j++) {
            C[index] = B[j];
            index++;
        }

        System.out.print("New array: ");
        for (int i = 0; i < C.length; i++) {

            System.out.print(C[i] + " ");
        }
    }
}
