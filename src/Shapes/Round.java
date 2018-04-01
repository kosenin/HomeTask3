package Shapes;


import BasicShapes.BasicShape;

import java.util.Objects;

public class Round extends BasicShape {


    public Round(double parameterOne) {
        super(parameterOne);
    }


    public void area() {
        System.out.println("Area of the given Round is " + Math.pow(dimensionOne, 2) * Math.PI);


    }


    @Override
    public int hashCode() {
        return Objects.hashCode(dimensionOne);
    }

}
