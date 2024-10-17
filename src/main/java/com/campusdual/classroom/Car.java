package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;
    private boolean isRunning = false;

    public Car() {
    }

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehicle on");
        } else if (this.tachometer == 1000) {
            System.out.println("The vehicle is already on");
        }
    }

    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            this.isRunning = false;
            System.out.println("Vehicle off");
        } else {
            System.out.println("You can't turn off the car, it has to be stopped");
        }
    }

    public void accelerate() {
        if (this.speedometer < MAX_SPEED) {
            this.speedometer += 20;
            System.out.println("Accelerating, current speed: " + this.speedometer + " km/h");
        } else {
            System.out.println("You have reached maximum speed.");
        }
    }

    public void brake() {
        if (this.speedometer > 0) {
            if (this.speedometer >= 20) {
                this.speedometer -= 20;
                System.out.println("Braking, the speed of the car is: " + this.speedometer + " km/h");
            } else {
                this.speedometer = 0;
                System.out.println("Braking, the speed of the car is: " + this.speedometer + " km/h, the vehicle has stopped");
            }
        } else {
            System.out.println("The vehicle is stopped");
        }
    }

    public void turnAngleOfWheels(int angle) {
        int newAngle = this.wheelsAngle + angle;
        if (newAngle <= 45 && newAngle >= -45) {
            this.wheelsAngle = newAngle;
            System.out.println("Steering wheel turned to: " + this.wheelsAngle + " degrees.");
        } else if (angle > 0) {
            this.wheelsAngle = 45;
            System.out.println("Steering wheel turned to the maximum right: 45 degrees.");
        } else if (angle < 0) {
            this.wheelsAngle = -45;
            System.out.println("Steering wheel turned to the maximum left: -45 degrees.");
        }
    }

    public void showSteeringWheelDetail() {
        System.out.println("The angle of the car is: " + wheelsAngle + " degrees.");
    }

    public void setReverse(boolean reverse) {
        if (this.speedometer == 0) {
            if (reverse) {
                this.gear = "R";
                this.reverse = true;
                System.out.println("The car is now in reverse.");
            } else {
                this.reverse = false;
                System.out.println("The vehicle must be stopped.");
            }
        }
    }
}