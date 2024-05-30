// Demo Class
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Shape shape = null;

        System.out.println("Choose a (1) Circle or (2) Rectangle: ");
        int choice = keyboard.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle: ");
                double radius = keyboard.nextDouble();
                if (radius > 0) {
                    shape = new Circle(radius);
                } else {
                    System.out.println("Invalid input. Radius must be positive.");
                    return;
                }
                break;
            case 2:
                System.out.println("Enter width of rectangle: ");
                double width = keyboard.nextDouble();
                System.out.println("Enter height of rectangle: ");
                double height = keyboard.nextDouble();
                if (width > 0 && height > 0) {
                    shape = new Rectangle(width, height);
                } else {
                    System.out.println("Invalid input. Width and height must both be positive.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid input.");
                return;
        }

        System.out.println("The area of the shape is: " + shape.calculateArea());
    }
}