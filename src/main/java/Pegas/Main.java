package Pegas;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Class<SingleTone> singleToneClass = SingleTone.class;
        System.out.println("TTT"+singleToneClass+"TTT");
        TestSingleTone tst = TestSingleTone.getInstance("1111");
        tst.sign();
        TestSingleTone tst2 = TestSingleTone.getInstance("2222");
        tst2.sign();
    }

}
