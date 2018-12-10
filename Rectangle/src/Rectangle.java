import java.util.Scanner;

public class Rectangle {
    private double width, height;

    private Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    private double getArea(){
        return this.width * this.height;
    }

    private double getPerimeter(){
        return (this.height + this.width) * 2;
    }

    private String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    public static class Execute{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the width:");
            double width = scanner.nextDouble();
            System.out.print("Enter the height:");
            double height = scanner.nextDouble();

            Rectangle rectangle = new Rectangle(width, height);
            System.out.println("Your Rectangle \n"+ rectangle.display());
            System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
            System.out.println("Area of the Rectangle: "+ rectangle.getArea());
        }
    }
}
