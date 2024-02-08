package Pegas.factoryMethod;

public class KidsPresent extends Present{
    @Override
    public String getName() {
        return "Toy";
    }

    @Override
    public String toString() {
        return getName();
    }
}
