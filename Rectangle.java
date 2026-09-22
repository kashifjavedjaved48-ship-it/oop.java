class Rectangle {
    public double length;
    public double width;

    public void displayInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + (length * width));
        System.out.println("Perimeter: " + (2 * (length + width)));
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rect1;

        rect1 = new Rectangle();
        rect1.length = 10;
        rect1.width = 5;

        System.out.println("rect1:");
        rect1.displayInfo();
    }
}