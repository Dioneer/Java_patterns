package Pegas;

import Pegas.builder.Builder;
import Pegas.builder.Director;
import Pegas.builder.ProgrammerBuilder;
import Pegas.singleTone.SingleTone;
import Pegas.singleTone.TestSingleTone;

public class Main {
    public static void main(String[] args) {
        /**
         * singleTone
         */
//        Class<SingleTone> singleToneClass = SingleTone.class;
//        System.out.println("TTT"+singleToneClass+"TTT");
//        TestSingleTone tst = TestSingleTone.getInstance("1111");
//        tst.sign();
//        TestSingleTone tst2 = TestSingleTone.getInstance("2222");
//        tst2.sign();
        /**
         * Builder
         */
        Builder builder = new ProgrammerBuilder();
        Director director = new Director();
        builder = director.createJunior(builder);
        System.out.println(builder.createProgrammer());
    }

}
