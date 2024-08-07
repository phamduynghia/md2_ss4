import java.util.Scanner;

public class Circle {
    float radius;
    String color;

    public Circle() {
    }

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void inputData(Scanner scanner) {


        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextFloat();
        System.out.print("Enter the color of the circle: ");
        color = scanner.nextLine();
    }
    public void display(){
        System.out.println("The circle color is: " + color);
        System.out.println("The radius of the circle is: " + radius);
        System.out.println("The perimeter of the circle is: " + getPerimeter());
        System.out.println("The area of the circle is: " + getArea());
    }
}
