import java.util.Scanner;

public class findMinValue {
    public static int minValue(int []array){

        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int size;
        int[] arr;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a size:");
        size = input.nextInt();

        arr = new  int[size];
        int i = 0;
        while (i < arr.length){
            System.out.print("Enter value " + (i + 1) + ": ");
            arr[i] = input.nextInt();
            i++;
        }

        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0;j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        System.out.print("\n");

        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
}
