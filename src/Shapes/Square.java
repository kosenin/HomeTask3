package Shapes;

import BasicShapes.BasicShape;

import java.util.Objects;

public class Square extends BasicShape {


    public Square(double parameterOne, double parameterTwo) {
        super(parameterOne, parameterTwo);
    }

    public double area() {
        return (dimensionOne * dimensionTwo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dimensionOne);
    }
}
