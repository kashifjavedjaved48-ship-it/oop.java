class Car {
    public String make;
    public String model;
    public int year;
    public String color;
    public int speed;

    public void displayInfo() {
        System.out.println(year + " " + make + " " + model + " (" + color + ")");
        System.out.println("Speed: " + speed + " km/h");
    }

    public void accelerate() {
        speed = speed + 10;
        System.out.println(model + " accelerated to " + speed + " km/h");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car car1;

        car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Corolla";
        car1.year = 2022;
        car1.color = "White";
        car1.speed = 0;

        System.out.println("car1:");
        car1.displayInfo();

        car1.accelerate();
        car1.accelerate();
    }
}