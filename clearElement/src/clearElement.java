import java.util.Scanner;

public class clearElement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array = {1, 3, 5, 7, 9, 11};
        System.out.print("Enter element: ");
        int value = input.nextInt();
        int index = 0;

        boolean isElement = false;
        for (int i = 0; i < array.length; i++){
            if (array[i] == value){
                System.out.println("Position of the element in the list " + value + " is: " + (i + 1));
                isElement = true;
                break;
            }
        }
        if (!isElement)
            System.out.println("Not found " + value + " in the list.");

        for (int j = 0; j < array.length; j++){
            if (array[j] != value){
                array[index] = array[j];
                index++;
            }
        }
        //array.length = index;
        System.out.print("New array: ");
        for (int i=0; i < array.length-1; i++){
            System.out.print(array[i] + "\t");
        }

    }
}
