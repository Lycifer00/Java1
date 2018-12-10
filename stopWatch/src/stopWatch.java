import java.util.Scanner;

public class stopWatch {
   // private long startTime, endTime;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] A = new int[10000];
        System.out.print("Enter number of terms: ");
        int n = input.nextInt();

        long startTime = System.currentTimeMillis();
        selectionSort(A, n);
        long endTime = System.currentTimeMillis();

        long time = endTime - startTime;

        System.out.println("Total time: " + time);



    }

    private static void conversion(int []A, int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }

    private static void selectionSort(int []A, int n) {
        for(int i=0; i < n-1; i++) {
            int minArr = i;
            for(int j=i+1; j < n; j++) {
                if(A[minArr]>A[j]) {
                    minArr = j;
                }
            }
            if(i!=minArr)
                conversion(A, minArr, i);
        }
    }
}
