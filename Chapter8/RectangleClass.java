package Chapter8;

public class RectangleClass {
    private double length = 1.0;
    private double width = 1.0;

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculatePerimeter(double length , double width) {
        return 2 * (length + width);
    }

    public void setLength(double length) {

        if (length < 0.0 || length > 20.0){
            throw new IllegalArgumentException("The length should be larger than 0.0 and less than 20.0");
        }
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {

        if (width < 0.0 || width > 20.0){
            throw new IllegalArgumentException("Width should be larger than 0.0 and less than 20.0");
        }
        this.width = width;
    }
}