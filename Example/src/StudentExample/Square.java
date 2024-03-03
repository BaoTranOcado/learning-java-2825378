package StudentExample;

public class Square {
    double sideLength;
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double calculateArea (){
        return sideLength*sideLength;
    }
}
