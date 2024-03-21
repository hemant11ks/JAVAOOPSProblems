public class ConstrChainVehicle {

    public static void main(String[] args) {
        // Creating a Vehicle object
        Vehicle vehicle1 = new Vehicle();
        System.out.println();

        // Creating a Car object
        Car car1 = new Car();
        System.out.println();

        // Creating a Car object with parameters
        Car car2 = new Car("Toyota", "Camry", 2020, 5);
        System.out.println();

        // Accessing properties of Car object created with parameters
        System.out.println("Brand: " + car2.getBrand());
        System.out.println("Model: " + car2.getModel());
        System.out.println("Year: " + car2.getYear());
        System.out.println("Number of Seats: " + car2.getNumberOfSeats());
        
    }
}

class Vehicle {

    private String brand;
    private String model;
    private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    // Now creating the default contrutor.
    public Vehicle(){
        System.out.println("Default Constructor of the Vehilce()...");
    }

    // Parameteried Constructor of the Vehicle Class
    public Vehicle(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
        System.out.println("Parameterised Constructor of the Vehicle(...)");
    }

}
class Car extends Vehicle {
    private int numberOfSeats;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

     // Default constructor
    public Car() {
        // Call the superclass default constructor using super()
        super();
        System.out.println("Creating a Car object...");
    }

    // Parameterized constructor chaining with superclass constructor
    public Car(String brand, String model, int year, int numberOfSeats) {
        // Call the superclass parameterized constructor using super()
        super(brand, model, year);
        this.numberOfSeats = numberOfSeats;
        System.out.println("Creating a Car object with parameters...");
    }

}

/*
We have a superclass Vehicle which represents a general vehicle. 
It has two constructors: a default constructor and a parameterized constructor.
We have a subclass Car which represents a specific type of vehicle, a car. 
It extends the Vehicle class and has an additional property numberOfSeats. 
It has two constructors: a default constructor and a parameterized constructor chaining to the superclass constructor.
In the Main class, we demonstrate creating objects of both the superclass Vehicle and the subclass Car. 
We create objects using both the default constructors and parameterized constructors, 
showcasing constructor chaining using super() to call the superclass constructors.
Detailed comments are provided in the code to explain each part.
*/