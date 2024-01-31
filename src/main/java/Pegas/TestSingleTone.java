package Pegas;

public class TestSingleTone {
    private static volatile TestSingleTone instance;
    private String sign;
    private TestSingleTone(String sign) {
        this.sign = sign;
    }
    public void sign(){
        System.out.println("This sign is: "+this.sign);
    }
    public static TestSingleTone getInstance(String sign){
        if(instance==null){
            synchronized (TestSingleTone.class){
                if(instance==null){
                    instance = new TestSingleTone(sign);
                }
            }
        }
        return instance;
    }
}
