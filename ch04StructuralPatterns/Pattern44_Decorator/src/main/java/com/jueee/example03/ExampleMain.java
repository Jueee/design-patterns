package com.jueee.example03;

// 测试类
public class ExampleMain {
    
    public static void main(String[] args) throws Exception {
        // 具体对象
        Car car = new Car();
        car.move();

        System.out.println("增加新功能：飞行.......");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("增加功能：水里游...... ");
        WaterCar waterCar = new WaterCar(car);
        waterCar.move();

        // 传递过去复合类型,拥有两个功能
        System.out.println("实现了两个功能");
        WaterCar waterCar2 = new WaterCar(flyCar);
        waterCar2.move();
    }

}
