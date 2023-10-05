package main.singleTon;

public class Settings {

    private static Settings instance;

    public static Settings getInstance(String param1, int param2, boolean param3) {
        if(instance == null){
            instance = new Settings();
            instance.param1 = param1;
            instance.param2 = param2;
            instance.param3 = param3;
        }
        return instance;
    }

    private String param1;
    private int param2;

    public String getParam1() {
        return param1;
    }

    public int getParam2() {
        return param2;
    }
    public boolean isParam3() {
        return param3;
    }

    private boolean param3;
    private Settings() {

    }
}
