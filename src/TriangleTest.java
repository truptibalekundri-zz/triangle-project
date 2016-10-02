
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void testTriangleTypeWithZeroValue() {
        try{
            Triangle triangle = new Triangle(0,2,3);
            triangle.getTriangleType();
        } catch(Exception e){
            assertEquals("Invalid Triangle : Sides of a triangle cannot be zero", e.getMessage());
        }
    }

    @Test
    public void testTriangleTypeWithNegativeValue() {
        try{
            Triangle triangle = new Triangle(1,-2,3);
            triangle.getTriangleType();
        } catch(Exception e){
            assertEquals("Invalid Triangle : Sides of a triangle cannot be less than zero", e.getMessage());
        }
    }

    @Test
    public void testTriangleTypeWithInvalidSides() {
        try{
            Triangle triangle = new Triangle(1,2,3);
            triangle.getTriangleType();
        } catch(Exception e){
            assertEquals("Invalid Triangle : Inequality rule not satisfied", e.getMessage());
        }
    }

    @Test
    public void testTriangleTypeEquilateral() throws Exception {
        Triangle triangle = new Triangle(2.4,2.4,2.4);
        TriangleType triangleType = triangle.getTriangleType();
        assertEquals(TriangleType.EQUILATERAL, triangleType);
    }

    @Test
    public void testTriangleTypeIsosceles() throws Exception {
        Triangle triangle = new Triangle(3,3,4);
        TriangleType triangleType = triangle.getTriangleType();
        assertEquals(TriangleType.ISOSCELES, triangleType);
    }

    @Test
    public void testTriangleTypeScalene() throws Exception{
        Triangle triangle = new Triangle(6,4,3);
        TriangleType triangleType = triangle.getTriangleType();
        assertEquals(TriangleType.SCALENE, triangleType);
    }
}
