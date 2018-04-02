package Shapes;


import BasicShapes.BasicShape;

import java.util.Objects;

public class Round extends BasicShape {


    public Round(double parameterOne) {
        super(parameterOne);
    }


    public double area() {
        return (Math.pow(dimensionOne, 2) * Math.PI);


    }


}
