import BasicShapes.BasicShape;

import java.util.Comparator;

/**
 * Created by Konstantin2 on 01.04.2018.
 */
public class ShapesComparator implements Comparator<BasicShape>

{

    @Override
    public int compare(BasicShape o1, BasicShape o2) {

        double length = o1.getDimensionOne();
        double length2 = o2.getDimensionOne();

        return Double.compare(length, length2);
    }


}

