package Pegas.prototype;

public record Flower(String color,String name) {
    public Flower clone(){
        return new Flower(color, name);
    }
    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
