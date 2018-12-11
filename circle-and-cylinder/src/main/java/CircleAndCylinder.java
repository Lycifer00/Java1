public class CircleAndCylinder {
    private double radius = 3.0;
    private String color = "Red";

    private CircleAndCylinder(){}

    private CircleAndCylinder(double radius,String color){
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    private String getColor(){
        return this.color;
    }

    private double getArea(){
        return radius * radius * Math.PI;
    }

    public String toString(){
        return "A Circle with color of " + getColor() + " and Area is " + getArea();
    }

    public static class Execute {
        public static void main(String[] args) {
            CircleAndCylinder circle = new CircleAndCylinder();
            System.out.println(circle);

            circle = new CircleAndCylinder(4.0, "Green");
            System.out.println(circle);
        }
    }

    private static class Cylinder extends CircleAndCylinder{
        private double height = 10.0;
        private Cylinder(){}

        private Cylinder(double height) {
            this.height = height;
        }

        private void setHeight(double height){
            this.height = height;
        }

        private double getHeight(){
            return height;
        }

        private Cylinder(double height, double radius, String color){
            super(radius, color);
            this.height = height;
        }

        private double Volume(){
            return Math.pow(getRadius(), 2) * this.height * Math.PI;
        }

        public String toString() {
            return "A Cylinder with height " + getHeight() + " and volume " + Volume() + ",which is subclass of " + super.toString();
        }


    }
    public static class testCylinder {
        public static void main(String[] args) {
            Cylinder cylinder = new Cylinder();
            System.out.println(cylinder);

            cylinder = new Cylinder(12,4.0, "Green");
            System.out.println(cylinder);
        }
    }
}
