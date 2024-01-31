package Pegas.builder;

import java.util.List;

public interface Builder {
    void setFirstName(String firstname);
    void setLastName(String lasttname);
    void setAge(int age);
    void setHardSkills(List<String> arr);
    void setSoftSkills(List<String> arr);
    Programmer createProgrammer();
}
