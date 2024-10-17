package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car myCar = new Car("Citroën", "Xsara","fuel");
        System.out.println(myCar.tachometer);
        System.out.println(myCar.isTachometerEqualToZero());
        myCar.start();
        System.out.println(myCar.tachometer);
        System.out.println(myCar.isTachometerEqualToZero());
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.brake();
        myCar.brake();
        myCar.brake();
        myCar.brake();
        myCar.brake();
        myCar.brake();
        myCar.brake();
        myCar.stop();
        myCar.turnAngleOfWheels(30);
        myCar.showSteeringWheelDetail();
        myCar.turnAngleOfWheels(10);
        myCar.showSteeringWheelDetail();
        myCar.turnAngleOfWheels(120);
        myCar.showSteeringWheelDetail();
        myCar.setReverse(true);
        System.out.println("Is the car in reverse? " + myCar.reverse);
    }
}