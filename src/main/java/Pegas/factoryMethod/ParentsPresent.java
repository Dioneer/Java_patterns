package Pegas.factoryMethod;

public class ParentsPresent extends Present{
    @Override
    public String getName() {
        return "Car";
    }

    @Override
    public String toString() {
        return getName();
    }
}
