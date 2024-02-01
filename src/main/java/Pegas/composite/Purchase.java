package Pegas.composite;

public class Purchase implements PackageComponent{
    private int price;
    public Purchase(int price) {
        this.price = price;
    }
    @Override
    public int countPrice() {
        return price;
    }
}
