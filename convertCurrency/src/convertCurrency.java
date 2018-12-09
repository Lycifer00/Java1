import java.util.Scanner;

public class convertCurrency {
    public static void main(String[] args){
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USD: ");
        usd = sc.nextDouble();
        double result = usd * 23000;
        System.out.print(result);
    }
}
