import java.util.Scanner;

public class displayTypes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();

        switch (choice){
            case 1:
                for (int i = 0; i < 3; i++){
                    System.out.print("\n");
                    //System.out.print("*");
                    for (int j = 0; j < 7; j++){
                        System.out.print("* ");
                    }
                }
                break;
            case 2:
                for (int i = 0; i < 5; i++){
                    System.out.print("\n");
                   // System.out.print("*");
                    for (int j = 0; j <= i; j++){
                        System.out.print("* ");
                    }
                }

                System.out.print("\n");

                for (int i = 0; i < 6; i++){
                    for (int j = 0; j < 6- i ; j ++){
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k ++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }

                System.out.print("\n");

                for(int i = 5;i > 0;i--){
                    System.out.print("\n");
                    //System.out.print("*");
                    for(int j = 1;j <= i;j++){
                        System.out.print("* ");
                    }
                }

                System.out.print("\n");

                for ( int i = 5 ; i >= 1 ; i --){
                    for (int j = 1; j <=5- i ; j ++){
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k ++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
            case 3:
                for ( int i = 0; i <= 5 ; i ++){
                    for( int j = 0; j <= 5-i; j ++) {
                        System.out.print(" ");
                    }
                    for(int k = 1; k <= i ; k ++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
