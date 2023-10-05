package main.factory;

import java.util.Random;

public class Program {
    private  static Random random = new Random();
    public static Employee generateWorker(Type type){
        String[] names = new String[] {"Kolya", "Petya", "Vasya", "Dima", "Ivan", "Denis"};
        String[] surNames = new String[] {"Pupkin", "Pipkin", "Popkin","Zhopkin", "kopkin", "Kapkin"};
        int typeIndex = random.nextInt(2);
        int salary = random.nextInt(200,500);
        return switch (type) {
            case Worker ->
                    new Worker(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], salary * 100);
            case Freelancer ->
                    new Freelancer(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], salary * 100);
        };
    }
    public static void main(String[] args) {

    }
}
