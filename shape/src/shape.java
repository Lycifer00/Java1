public class shape {
    private String color = "green";
    private boolean filled = true;

    private   shape(){

    }
    private shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    private String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
    public static class ShapeTest {
        public static void main(String[] args) {
            shape shape = new shape();
            System.out.println(shape);

            shape = new shape("red", false);
            System.out.println(shape);
        }
    }

    public static class Circle extends shape {
        private double radius = 1.0;

        private Circle() {
        }

        private Circle(double radius) {
            this.radius = radius;
        }

        private Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius = radius;
        }

        private double getRadius() {
            return radius;
        }

        private void setRadius(double radius) {
            this.radius = radius;
        }

        private double getArea() {
            return radius * radius * Math.PI;
        }

        public double getPerimeter() {
            return 2 * radius * Math.PI;
        }

        @Override
        public String toString() {
            return "A Circle with radius="
                    + getRadius()
                    + ", which is a subclass of "
                    + super.toString();
        }
    }
    public static class CircleTest {
        public static void main(String[] args) {
            Circle circle = new Circle();
            System.out.println(circle);

            circle = new Circle(3.5);
            System.out.println(circle);

            circle = new Circle(3.5, "indigo", false);
            System.out.println(circle);
        }
    }

    public static class Rectangle extends shape {
        private double width = 2.0;
        private double length = 5.0;

        private Rectangle() {
        }

        private Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        private Rectangle(double width, double length, String color, boolean filled) {
            super(color, filled);
            this.width = width;
            this.length = length;
        }

        private double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        private double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getArea() {
            return this.width * this.length;
        }

        public double getPerimeter() {
            return 2 * (this.width + this.length);
        }

        @Override
        public String toString() {
            return "A Rectangle with width="
                    + getWidth()
                    + " and length="
                    + getLength()
                    + ", which is a subclass of "
                    + super.toString();
        }

        public static class RectangleTest {
            public static void main(String[] args) {
                Rectangle rectangle = new Rectangle();
                System.out.println(rectangle);

                rectangle = new Rectangle(2.3, 5.8);
                System.out.println(rectangle);

                rectangle = new Rectangle(2.5, 3.8, "orange", true);
                System.out.println(rectangle);
            }
        }

        public static class Square extends shape {

            private double side = 3.0;
            private Square() {
            }

            private Square(double side) {
                this.side = side;
            }

            private Square(double side, String color, boolean filled) {
                super(color, filled);
                this.side = side;
            }

            private void setSide(double side) {
                this.side = side;
            }

            private double getSide() {
                return side;
            }

            @Override
            public String toString() {
                return "A Square with side="
                        + getSide()
                        + ", which is a subclass of "
                        + super.toString();
            }
        }

        public static class SquareTest {
            public static void main(String[] args) {
                Square square = new Square();
                System.out.println(square);

                square = new Square(2.3);
                System.out.println(square);

                square = new Square(5.8, "yellow", true);
                System.out.println(square);
            }
        }

    }
}

