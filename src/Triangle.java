

public class Triangle {
    private double _sideA;
    private double _sideB;
    private double _sideC;

    public Triangle(double a,double b,double c){
        _sideA = a;
        _sideB = b;
        _sideC = c;
    }

    public TriangleType getTriangleType() throws Exception {
        if(checkIfSideIsZero()) {
            throw new Exception("Invalid Triangle : Sides of a triangle cannot be zero");
        } else if(checkIfSideIsNegative()) {
            throw new Exception("Invalid Triangle : Sides of a triangle cannot be less than zero");
        } else if(checkIfSidesAreInvalid()) {
            throw new Exception("Invalid Triangle : Inequality rule not satisfied");
        } else if (checkIfAllSidesAreEqual()) {
            return TriangleType.EQUILATERAL;
        } else if (checkIfAnyTwoSidesAreEqual()) {
            return TriangleType.ISOSCELES;
        } else {
            return TriangleType.SCALENE;
        }
    }

    private boolean checkIfSidesAreInvalid() {
        return !((_sideA + _sideB > _sideC) && (_sideA + _sideC > _sideB) && (_sideB + _sideC > _sideA));
    }

    private boolean checkIfSideIsZero() {
        return _sideA == 0 || _sideB == 0 || _sideC == 0;
    }

    private boolean checkIfSideIsNegative() {
        return _sideA < 0 || _sideB < 0 || _sideC < 0;
    }

    private boolean checkIfAllSidesAreEqual(){
        return (_sideA == _sideB) && (_sideB == _sideC);
    }

    private boolean checkIfAnyTwoSidesAreEqual(){
        return _sideA == _sideB || _sideB == _sideC || _sideC == _sideA;
    }

}
