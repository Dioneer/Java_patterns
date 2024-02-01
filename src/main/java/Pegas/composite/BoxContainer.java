package Pegas.composite;

import java.util.List;

public class BoxContainer implements PackageComponent{
    private final List<PackageComponent> list;
    public BoxContainer(List<PackageComponent> list) {
        this.list = list;
    }
    public void add(PackageComponent component){
        list.add(component);
    }
    public void remove(PackageComponent component){
        list.remove(component);
    }
    public void remove(int index){
        list.remove(index);
    }
    public List<PackageComponent> getChildren(int index){
        return list;
    }
    @Override
    public int countPrice() {
        return list.stream().map(PackageComponent::countPrice).mapToInt(i-> i).sum();
    }
}
