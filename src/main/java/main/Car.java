package main;

public class Car {
    private String brand;
    private String model;
    private int speed;

    public Car(String brand, String model, int speed) {

        this.brand = brand;        
        this.model = model;
        speed = 0;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

   public void accelerate(int speed) {
        this.speed = speed;
   }

   public void decelerate(int speed) {
        this.speed = speed;
   }

    public void printSpecs() {
        System.out.println("Auto: " + brand + " " + model + ", Nopeus: " + speed + " km/h");
    }
}

