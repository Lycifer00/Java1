import java.util.Scanner;

public class findMinInArray {
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter element1: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "]");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array is: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");

        int min = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        System.out.print("The min value of array is: " + arr[index]);
       // System.out.print(arr[0]);
    }
}
