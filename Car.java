public class Car {
    private String name;
    private int maxSpeed;
    private int yearOfMake;

    // Constructor
    public Car(String name, int maxSpeed, int yearOfMake) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.yearOfMake = yearOfMake;
    }

    // Display car information
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Name: " + name);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Year of Make: " + yearOfMake);
        System.out.println();
    }

    // Main method to create Car object and run methods
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota Camry", 180, 2022);

        // Display car information
        myCar.displayInfo();
    }
}



