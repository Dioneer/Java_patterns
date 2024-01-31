package Pegas.singleTone;

public final class SingleTone {
    private volatile static SingleTone instance;

    private SingleTone() {
    }

    public static SingleTone getInstance(){
        if(instance==null){
            synchronized(SingleTone.class){
                if(instance==null){
                    return instance = new SingleTone();
                }
            }

        }
        return instance;
    }
}
