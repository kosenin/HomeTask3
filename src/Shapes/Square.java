package Shapes;

import BasicShapes.BasicShape;

import java.util.Objects;

public class Square extends BasicShape {


    public Square(double parameterOne, double parameterTwo) {
        super(parameterOne, parameterTwo);
    }

    public void area() {
        System.out.println("Area of the given Square is " + dimensionOne * dimensionTwo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dimensionOne);
    }
}
