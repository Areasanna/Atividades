package Lista_de_Classes.Exerc_5src;

public class Circle {
        private double x; // Centro X
        private double y; // Centro Y
        private double radius;

        public Circle(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }
        public double calculateArea() {
            return Math.PI * this.radius * this.radius;
        }
        public boolean contains(double px, double py) {
            double distance = Math.sqrt(Math.pow(px - this.x, 2) + Math.pow(py - this.y, 2));

            return distance <= this.radius;
        }
        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
        public double getRadius() {
            return radius;
        }
    }
