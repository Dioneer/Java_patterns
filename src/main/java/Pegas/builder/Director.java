package Pegas.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Director {
    public Builder createJunior(Builder builder){
        List<String> hardSkills = new ArrayList<>(Arrays.asList("Java Core", "OS Windows", "NodePade++"));
        builder.setHardSkills(hardSkills);
        List<String> softSkills = new ArrayList<>(Arrays.asList("Funny", "Clever", "Hardworking"));
        builder.setSoftSkills(softSkills);
        return builder;
    }
    public Builder createMiddle(Builder builder){
        List<String> hardSkills = new ArrayList<>(Arrays.asList("Java EE", "OS Windows", "NodePade++"));
        builder.setHardSkills(hardSkills);
        List<String> softSkills = new ArrayList<>(Arrays.asList("Calm", "Clever", "Hardworking"));
        builder.setSoftSkills(softSkills);
        return builder;
    }
    public Builder createSenior(Builder builder){
        List<String> hardSkills = new ArrayList<>(Arrays.asList("Micro Service", "OS Windows", "NodePade++"));
        builder.setHardSkills(hardSkills);
        List<String> softSkills = new ArrayList<>(Arrays.asList("Strong", "Clever", "Hardworking"));
        builder.setSoftSkills(softSkills);
        return builder;
    }
}
