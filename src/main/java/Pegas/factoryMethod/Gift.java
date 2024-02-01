package Pegas.factoryMethod;

public class Gift {
    public Present createGist(int age){
        if(age<18){
            return new KidsPresent();
        }else {
            return new ParentsPresent();
        }
    }
}
