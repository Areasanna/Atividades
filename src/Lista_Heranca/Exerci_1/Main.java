package Lista_Heranca.Exerci_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       // Polimorfismo
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circule(5.0));
        shapes.add(new Rectangle(12.0, 5.0));
        shapes.add(new Circule(3.6));

        for(Shape shapeIMPL : shapes){
            System.out.println("Área: \n"+shapeIMPL.calculateArea());
            System.out.println("Perímetro: "+shapeIMPL.calculatePerimeter());
        }
    }
}
