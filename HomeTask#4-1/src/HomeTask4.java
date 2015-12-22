public class HomeTask4 {
    public static void main(String[] args){

        double s1;
        int s2;
        double s3;

        Triangle triangle = new Triangle(4, 3, 5, 12);
        s1 = Math.sqrt((triangle.getPerimetr()) * (triangle.getPerimetr()-triangle.getSideA()) * (triangle.getPerimetr()-triangle.getSideB()) * (triangle.getPerimetr()-triangle.getSideC()));
        System.out.println("Square of triangle is equal to " +s1);

        System.out.println();

        Rectangle rectangle = new Rectangle(4, 4, 10, 10);
        s2 = rectangle.getSideA() * rectangle.getSideB();
        System.out.println("Square of rectangle is equal to " +s2);

        System.out.println();

        Circle circle = new Circle(4);
        s3 = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("Square of circle is equal to " +s3);

    }
}
