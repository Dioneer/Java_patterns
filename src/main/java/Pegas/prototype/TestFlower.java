package Pegas.prototype;

public record TestFlower(String color,String name) {
    public TestFlower clone() {
        return new TestFlower(color,name);
    }
    @Override
    public String toString() {
        return "TestFlower{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
