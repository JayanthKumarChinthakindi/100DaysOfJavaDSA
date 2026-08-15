class Car {
    String brand;
    String model;
    int year;
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println();
    }
}
public class ObjectDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2025;
        Car car2 = new Car();
        car2.brand = "Honda";
        car2.model = "City";
        car2.year = 2024;
        Car car3 = new Car();
        car3.brand = "Hyundai";
        car3.model = "Creta";
        car3.year = 2026;
        System.out.println("CAR 1");
        car1.displayDetails();
        System.out.println("CAR 2");
        car2.displayDetails();
        System.out.println("CAR 3");
        car3.displayDetails();
    }
}