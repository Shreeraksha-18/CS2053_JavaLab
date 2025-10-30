class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called");
    }

    public void start() {
        System.out.println(brand + " vehicle starting...");
    }
}

class Car extends Vehicle {
    int wheels;

    public Car(String brand, int wheels) {
        super(brand);
        this.wheels = wheels;
        System.out.println("Car constructor called");
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Car with " + wheels + " wheels is ready to go!");
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    public ElectricCar(String brand, int wheels, int batteryCapacity) {
        super(brand, wheels);
        this.batteryCapacity = batteryCapacity;
        System.out.println("ElectricCar constructor called");
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Electric car battery capacity: " + batteryCapacity + " kWh");
        System.out.println("Silent electric car starting...");
    }
}

public class VehicleInherit {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", 4, 100);
        tesla.start();
    }
}
