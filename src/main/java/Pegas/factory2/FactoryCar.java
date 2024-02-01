package Pegas.factory2;

public class FactoryCar {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car car1 = factory.create(TypeOfCar.valueOf("BIG"));
        Car car2 = factory.create(TypeOfCar.valueOf("SMALL"));
        car1.drive();car2.drive();
    }
}
interface Car{
    void drive();
}
class SmallCar implements Car{
    @Override
    public void drive() {
        System.out.println("Small car is drive");
    }
}
class BiglCar implements Car{
    @Override
    public void drive() {
        System.out.println("Big car is drive");
    }
}
class Factory{
    public Car create(TypeOfCar type){
        return switch(type){
            case BIG-> new BiglCar();
            case SMALL-> new SmallCar();
        };
    }
}
enum TypeOfCar{
    BIG,
    SMALL
}