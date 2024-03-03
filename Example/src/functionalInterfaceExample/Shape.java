package functionalInterfaceExample;

import StudentExample.Square;

@FunctionalInterface
public interface Shape {
    public abstract double getArea (Square square);
}
