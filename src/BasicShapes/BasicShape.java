package BasicShapes;

/**
 * Created by Konstantin2 on 28.03.2018.
 */
public class BasicShape {

    protected double dimensionOne;
    protected double dimensionTwo;

    public BasicShape(double dimensionOne, double dimensionTwo) {
        this.dimensionOne = dimensionOne;
        this.dimensionTwo = dimensionTwo;
    }


    public BasicShape(double dimensionOne) {
        this.dimensionOne = dimensionOne;
    }

    public double area() {
        return this.area();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        BasicShape other = (BasicShape) o;
        if (dimensionOne != other.dimensionOne)
            return false;
        if (dimensionTwo != other.dimensionTwo)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(dimensionOne);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(dimensionTwo);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
