import BasicShapes.BasicShape;
import Shapes.Round;

import java.util.Comparator;

/**
 * Created by Konstantin2 on 01.04.2018.
 */
public class ShapesComparator implements Comparator<BasicShape>

{
    @Override
    public int compare(BasicShape o1, BasicShape o2) {


        double area1 = o1.area();
        double area2 = o2.area();

        return Double.compare(area1, area2);
    }

}



