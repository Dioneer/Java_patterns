package Pegas;

import Pegas.adapter.*;
import Pegas.builder.Builder;
import Pegas.builder.Director;
import Pegas.builder.ProgrammerBuilder;
import Pegas.builder2.Order;
import Pegas.builder2.OrderBuilder;
import Pegas.composite.BoxContainer;
import Pegas.composite.Purchase;
import Pegas.decorator.EmailNotification;
import Pegas.decorator.MessageNotification;
import Pegas.decorator.Notification;
import Pegas.decorator.SMSNotification;
import Pegas.factory.Employee;
import Pegas.factory.EmpolyeeType;
import Pegas.factory.Freelancer;
//import Pegas.factory.Worker;
import Pegas.factoryMethod.Gift;
import Pegas.factoryMethod.Present;
import Pegas.observer.*;
import Pegas.prototype.Flower;
import Pegas.proxy.DailyReport;
import Pegas.proxy.Proxy;
import Pegas.proxy.Report;
import Pegas.singleTone.SingleTone;
import Pegas.singleTone.TestSingleTone;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

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
//        Builder builder = new ProgrammerBuilder();
//        Director director = new Director();
//        builder = director.createJunior(builder);
//        System.out.println(builder.createProgrammer());
        /**
         * Builder2
         */
//            Order order = new OrderBuilder().setClientName("QQQQ").setPrice(123)
//                    .setProductId(456).setSign(true).setProductName("OP").build();
//        System.out.println(order);
        /**
         * factory
         */
//        Random random= new Random();
//        Employee employee = generateEmployee(EmpolyeeType.valueOf("Freelancer"), random);
//        System.out.println(employee);
//        Employee employee1 = new Employee("Kesha", "Keshanya", 123) {
//            @Override
//            public double calculateSalary() {
//                return 0;
//            }
//        };
//        System.out.println(employee1);
        /**
         * adapter
         */
//        MeteoStore meteoStore = new MeteoStore();
//        meteoStore.save(new MS200(13));
//        ST500 st500 = new ST500(456);
//        meteoStore.save(new AdapterST500(st500));
        /**
         * observer
         */
//        Publisher job = new JobAgency();
//        Company company1 = new Company(job,"Goggle", 1200000 );
//        Company company2 = new Company(job,"Yandex", 500000 );
//        Worker worker1 = new Worker("Igor");
//        Worker worker2 = new Worker("Ira");
//        Student student = new Student("Petr");
//        job.registerObserver(worker1);
//        job.registerObserver(worker2);
//        job.registerObserver(student);
//        for (int i = 0; i < 4; i++) {
//            company1.needEmployee();
//            company2.needEmployee();
//        }
        /**
         * prototype
         */
//        Flower flower = new Flower("Red", "Rose");
//        Flower flower1 = flower.clone();
//        System.out.println(flower1);
        /**
         * factoryMethod
         */
//        Present gift = new Gift().createGist(25);
//        System.out.println(gift);
        /**
         * composite
         */
//        BoxContainer boxContainer = new BoxContainer(Arrays.asList(new Purchase(25),new Purchase(44),
//        new Purchase(56),new Purchase(50)));
//        System.out.println(boxContainer.countPrice());
        /**
         * decorator
         */
//        EmailNotification notification = new EmailNotification();
//        SMSNotification smsNotification = new SMSNotification(notification);
//        MessageNotification messageNotification = new MessageNotification(smsNotification);
//        sendNotofication(messageNotification);
        /**
         * proxy
         */
        prepare(new Proxy(new DailyReport()), LocalDate.now());
    }
//    static Employee generateEmployee(EmpolyeeType empolyeeType, Random random){
//        String[]names = new String[]{"Kesha","Gosha","Dima","Domna"};
//        String[]surNames = new String[]{"Keshanya","Goshanya","Dimanya","Domnanya"};
//        int salary = random.nextInt(200, 500);
//        int index = random.nextInt(100,150);
//        return switch (empolyeeType){
//            case Freelancer->new Freelancer(names[random.nextInt(4)],surNames[random.nextInt(4)],
//                    salary*index);
//            case Worker->new Worker(names[random.nextInt(4)],surNames[random.nextInt(4)],
//                    salary*index);
//
//        };
//    }
//    private static void sendNotofication(Notification notification){
//        notification.send();
//    }
    private static void prepare(Report report, LocalDate localDate){
        System.out.println(report.prepareReport(localDate));
    }
}
