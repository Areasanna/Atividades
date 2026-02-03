package Lista_Heranca.Exerci_1;

public class Rectangle implements Shape {
    private double width;
    private double heigth;

    public Rectangle(double width, double heigth){
       this.width = width;
        this.heigth = heigth;
    }

    @Override
    public double calculateArea() {
      return width*heigth;
    }

    @Override
    public double calculatePerimeter() {
        return 2 *(width+heigth);
    }
}
