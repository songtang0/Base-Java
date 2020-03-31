package qianfeng01.objectOriented.polymorphic_10;

/**
 * desc: 多态 auth:SongTang
 * modified: 2020.03.28
 */
public class TestVehicle_02 {
    public static void main (String[] args) {
        Employee emp = new Employee();
        emp.name = "SongTang";
        Vehicle vehicle = emp.buyVehicle(300); // 返回一个Vehicle实例
        if (vehicle != null) {
            emp.goHome(vehicle);
        }
//        Bus myBus = (Bus)vehicle; // 类型转换不能由低向高
//        System.out.println(myBus.setNum);
        if (vehicle instanceof Bus) {
            Bus bus = (Bus)vehicle;
            System.out.println("公交车的座位数是：" + bus.setNum);
        } else if (vehicle instanceof Car) {
            Car car = (Car)vehicle;
            System.out.println("小汽车的品牌是：" + car.brand);
        } else {
            Bicycle bicycle = (Bicycle)vehicle;
            System.out.println("自行车的颜色是：" + bicycle.color);
        }
    }
}

class Employee {
    String name;
    // 乘坐...回家
    public void goHome(Vehicle veh) {
        System.out.println(name + "正在乘坐");
        veh.run();
    }
    //买
    public Vehicle buyVehicle (int money) { // 预算
        Vehicle myVehicle = null;
        if (money > 1000000) {
            Bus markBus = new Bus("公交车", 70,2000000D, 20); // 创建子类对象
            myVehicle = markBus; // 父类引用指向子类对象
        } else if (money > 500000) {
            myVehicle = new Car();
        } else {
            myVehicle = new Bicycle();
        }
        return myVehicle;
    }
}

class Vehicle {
    String type; // 车型 如：小轿车、公交、货车、自行车
    int speed; // 速度
    double price; // 价格

    public void run () {
        System.out.println("一辆" + price + "的" + type + "正在以" + speed + "/H的速度前进");
    }
}

class Car extends Vehicle {
    String brand; // 品牌

    public void run () { // 对父类方法进行重写、覆盖
        System.out.println("一辆价值" + price + "的，" + brand + "品牌的" + type + "正在以" + speed + "/H的速度前进");
    }
}

class Bus extends Vehicle {
    int setNum; // 座位数
    // 构造函数
    public Bus (String type, int speed, double price, int setNum) {
        this.type = type;
        this.speed = speed;
        this.price = price;
        this.setNum = setNum;
    }
    public void run () {
        System.out.println("一辆价值" + price + "的，拥有" + setNum + "个座位的" + type + "正在以" + speed + "/H的速度前进");
    }
}

class Bicycle extends Vehicle {
    String color; // 颜色

    public void run () {
        System.out.println("一辆价值" + price + "的，" + color + "色的" + type + "正在以" + speed + "/H的速度前进..");
    }
}