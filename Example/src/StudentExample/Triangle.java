package StudentExample;

public class Triangle {
    static int noOfSides = 3;
    double baseLength;
    double heightLength;
    double side1Length;
    double side2Length;
    double side3Length;
    public Triangle (double baseLength, double heightLength, double side1Length, double side2Length, double side3Length){
        this.baseLength = baseLength;
        this.heightLength = heightLength;
        this.side1Length = side1Length;
        this.side2Length = side2Length;
        this.side3Length = side3Length;
    }
    public double findArea () {
        return (this.baseLength * this.heightLength)/2;
    }
}
