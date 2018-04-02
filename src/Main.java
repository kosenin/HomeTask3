import BasicShapes.BasicShape;
import Shapes.Round;
import Shapes.Square;
import Shapes.Triangle;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        Map<BasicShape, Double> shapesMap = new HashMap<>(30, 10);


        Square square1 = new Square(1.0, 1.3);
        Square square2 = new Square(2.0, 22.3);
        Square square3 = new Square(3.0, 22.3);
        Square square4 = new Square(4.0, 22.3);
        Square square5 = new Square(5.0, 22.3);

        Round round1 = new Round(13.4);
        Round round2 = new Round(122.4);
        Round round3 = new Round(11.4);
        Round round4 = new Round(2.4);
        Round round5 = new Round(8.4);

        Triangle triangle1 = new Triangle(3.1, 13.4);
        Triangle triangle2 = new Triangle(13.1, 2.4);
        Triangle triangle3 = new Triangle(23.1, 16.4);
        Triangle triangle4 = new Triangle(21.1, 12.4);
        Triangle triangle5 = new Triangle(3222.1, 12314.4);


        shapesMap.put(square1, square1.area());
        shapesMap.put(square2, square2.area());
        shapesMap.put(square3, square3.area());
        shapesMap.put(square4, square4.area());
        shapesMap.put(square5, square5.area());

        shapesMap.put(round1, round1.area());
        shapesMap.put(round2, round2.area());
        shapesMap.put(round3, round3.area());
        shapesMap.put(round4, round4.area());
        shapesMap.put(round5, round5.area());

        shapesMap.put(triangle1, triangle1.area());
        shapesMap.put(triangle2, triangle2.area());
        shapesMap.put(triangle3, triangle3.area());
        shapesMap.put(triangle4, triangle4.area());
        shapesMap.put(triangle5, triangle5.area());


        List list = new ArrayList(shapesMap.keySet());
        list.sort(new ShapesComparator());


        for (int i = 0; i < shapesMap.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
