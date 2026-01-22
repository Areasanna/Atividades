package Lista_de_Classes.Exerc_4src;

public class Rectangle {
    private double x;
    private double y;
    private double width;
    private double altura;

    public Rectangle(double x, double y, double width, double altura){
        this.x = x;
        this.y = y;
        this.width = width;
        this.altura = altura;
    }
    public double calculeArea(){
      return this.altura * this.width;
    }
    public boolean contains(double px, double py){
      boolean verificaX = (px >= this.x) && (px <= (this.x+this.width));
      boolean verificaY = (py >=this.y) && (py <= (this.y+this.altura));

      return verificaY && verificaX;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getWidth() {
        return width;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
