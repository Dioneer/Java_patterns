package Pegas.builder;

import java.util.List;

public class Programmer {
    private String firstname;
    private String lastname;
    private int age;
    private List<String> hard;
    private List<String> soft;

    public Programmer(String firstname, String lastname, int age, List<String> hard, List<String> soft) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.hard = hard;
        this.soft = soft;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHard() {
        return hard;
    }

    public void setHard(List<String> hard) {
        this.hard = hard;
    }

    public List<String> getSoft() {
        return soft;
    }

    public void setSoft(List<String> soft) {
        this.soft = soft;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", hard=" + hard +
                ", soft=" + soft +
                '}';
    }
}
