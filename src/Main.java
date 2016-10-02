public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,0,4);
        String triangleType;
        try{
             triangleType = triangle.getTriangleType().toString();
        } catch (Exception e){
            triangleType = e.getMessage();
        }
        System.out.println(triangleType);
    }
}
