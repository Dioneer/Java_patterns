package Pegas.composite;

import java.util.List;

public record BoxContainer(List<PackageComponent> list) implements PackageComponent {
    public void add(PackageComponent component) {
        list.add(component);
    }

    public void remove(PackageComponent component) {
        list.remove(component);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public List<PackageComponent> getChildren(int index) {
        return list;
    }

    @Override
    public int countPrice() {
        return list.stream().map(PackageComponent::countPrice).mapToInt(i -> i).sum();
    }
}
