import java.util.Scanner;

public class countCharacters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string =  input.nextLine();
        System.out.print("Enter character: ");
        char character = input.next().charAt(0);
        int count = 0;

        for (int i =0; i < string.length(); i++){
            if (string.charAt(i) == character){
                count++;
            }
        }

        System.out.println(" The number of occurrences of" + " " + character + " " + "is: " + count);
    }
}

