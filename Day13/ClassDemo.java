class Car {
    String brand;
    String model;
    int year;
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
public class ClassDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Camry";
        car.year = 2025;
        System.out.println("CAR DETAILS");
        car.displayDetails();
    }
}