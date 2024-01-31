package Pegas.builder;

import java.util.List;

public class ProgrammerBuilder implements Builder{
    private String firstname;
    private String lastname;
    private int age;
    private List<String> hard;
    private List<String> soft;
    @Override
    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }
    @Override
    public void setLastName(String lastName) {
        this.lastname = lastName;
    }
    @Override
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void setHardSkills(List<String> arr) {
        this.hard = arr;
    }
    @Override
    public void setSoftSkills(List<String> arr) {
        this.soft = arr;
    }
    @Override
    public Programmer createProgrammer() {
        return new Programmer(firstname, lastname, age, hard, soft);
    }
}
