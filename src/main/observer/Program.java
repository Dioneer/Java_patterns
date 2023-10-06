package main.observer;

public class Program {
    public static void main(String[] args) {
        Publisher publisher = new Agency();
        Company google1 = new Company(150000, "Google1", publisher);
        Company google2 = new Company(15000, "Google2", publisher);
        Company google3 = new Company(1500, "Google3", publisher);

        Student student1 = new Student("Kesha");
        Student student2 = new Student("Sasha");
        Worker worker1 = new Worker("Igor");
        Worker worker2 = new Worker("Misha");

        publisher.registerObserver(student1);
        publisher.registerObserver(student2);
        publisher.registerObserver(worker1);
        publisher.registerObserver(worker2);

        for (int i = 0; i < 4; i++) {
            google1.needEmployee();
            google2.needEmployee();
            google3.needEmployee();
        }
    }

}
