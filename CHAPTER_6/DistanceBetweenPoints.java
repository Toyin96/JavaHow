package Chapter6;

public class DistanceBetweenPoints {


    public double getDistance(double X1, double Y1, double X2, double Y2) {

        double result =  Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2));

        return result;
    }
}
