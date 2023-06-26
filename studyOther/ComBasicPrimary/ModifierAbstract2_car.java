package main.java.ComBasicPrimary;

public class ModifierAbstract2_car {  // car ：汽车
    public static void main(String[] arge){
        Car c = new Car();
        System.out.println(c.noOfWheels());  // 四轮车

        Vehicle mo = new Motorbike();
        System.out.println(mo.noOfWheels());  // 双轮车
    }
}

abstract class Vehicle{  // 车辆
    abstract String noOfWheels();  // wheels 车轮
}

class Car extends Vehicle{
    String noOfWheels(){
        return "四轮车";
    }
}
class Motorbike extends Vehicle{  // motorbike 摩托车
    String noOfWheels(){
        return "双轮车";
    }
}