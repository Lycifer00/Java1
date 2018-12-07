import java.util.Scanner;

public class printPrimeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        int i = 2;
        int count = 0;
        while(count < n){
            if (isPrimrNumber(i)){
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
    private static boolean isPrimrNumber(int x){
        if (x < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(x);
        for (int i = 2; i <= squareRoot; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;

    }
}
