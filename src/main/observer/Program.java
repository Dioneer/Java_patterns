package main.observer;

import main.adapter.*;

public class Program {
    public static void main(String[] args) {
        MeteoStore meteoStore  = new MeteoStore();
        MS200 ms200  = new MS200(26);
        meteoStore.save(ms200);
        St500 st500 = new St500(123);
        meteoStore.save(new AdapterSt500(st500));
    }
}
