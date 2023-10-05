package main.singleTon;

public class Programm {
    public static void main(String[] args) {
    Settings settings1 = Settings.getInstance("ads", 123, true);
        System.out.println(settings1.getParam1());
        Settings settings21 = Settings.getInstance("add", 123, true);
        System.out.println(settings21.getParam1());

    }
}
