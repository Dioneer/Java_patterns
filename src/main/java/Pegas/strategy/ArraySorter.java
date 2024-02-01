package Pegas.strategy;

public class ArraySorter {
    private SortingStrategy strategy;
    public ArraySorter(SortingStrategy strategy) {
        this.strategy = strategy;
    }
    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }
    public void sort(int[] arr){
        strategy.sort(arr);
    }
}
