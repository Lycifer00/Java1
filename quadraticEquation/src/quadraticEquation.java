import java.util.Scanner;

public class quadraticEquation {
    double a, b, c;

    private quadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static class Execute{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a: ");
            double a = input.nextDouble();
            System.out.print("Enter b: ");
            double b = input.nextDouble();
            System.out.print("Enter c: ");
            double c = input.nextDouble();

            quadraticEquation qe = new quadraticEquation( a,  b,  c);
            if (qe.getDiscriminant() > 0){
                System.out.println("Equation has 2 root is: ");
                System.out.println(qe.getRoot1()+" ");
                System.out.println(qe.getRoot2() + " ");
            }
            else if (qe.getDiscriminant() == 0){
                System.out.println("Equation has one root is: ");
                System.out.println(qe.getRoot());
            }
            else {
                System.out.println("Equation is no root!");
            }
        }
    }


    private double getDiscriminant(){
        return  this.b * this.b- 4 * this.a * this.c;
    }

    private double getRoot1(){
       return  (-this.b + Math.pow((this.b * this.b -4*this.a*this.b), 0.5)) / (2 * this.a);
    }

    private double getRoot2(){
       return  (-this.b - Math.pow((this.b * this.b -4*this.a*this.b), 0.5)) / (2 * this.a);
    }

    private  double getRoot(){
        return -this.b / (2 * this.a);
    }

}
