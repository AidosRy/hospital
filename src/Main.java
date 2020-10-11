import bridge.*;
import factory.Factory;
import factory.Human;
import factory.HumanType;
import strategy.Payment;
import strategy.Earn;
import strategy.Pay;

public class Main {

    public static void main(String[] args) {

        /*
        Фабричный метод — это паттерн проектирования,
        который определяет общий интерфейс для создания объектов в суперклассе,
         позволяя подклассам изменять тип создаваемых объектов.
         */
        Factory factory = new Factory();

        Human doctor = factory.getHuman(HumanType.DOCTOR);
        doctor.setMoney(100);
        Human patient = factory.getHuman(HumanType.PATIENT);
        patient.setMoney(100);

        /*Стратегия — это поведенческий паттерн проектирования,
        который определяет семейство схожих алгоритмов и помещает
         каждый из них в собственный класс, после чего алгоритмы можно
         взаимозаменять прямо во время исполнения программы.
        */
        int cost_for_visit = 10;
        Payment payment = new Payment(new Pay());
        int patient_money_left = payment.operate(patient.getMoney(), cost_for_visit);
        patient.setMoney(patient_money_left);
        System.out.println("Patient money left:"+patient_money_left);

        payment = new Payment(new Earn());
        int doctor_earned_money = payment.operate(doctor.getMoney(), cost_for_visit);
        doctor.setMoney(doctor_earned_money);
        System.out.println("Doctor money left:"+doctor_earned_money);

        /*
        Мост — это паттерн проектирования,
         который разделяет один или несколько классов на две отдельные иерархии —
         абстракцию и реализацию, позволяя изменять их независимо друг от друга.
         */

        InsuranceCreator insuranceCreator//implementor(interface)
                = new ExpensiveInsurance();//concrete implementor(interface implementation)
        Hospital hospital //abstraction(abstract class)
                = new Asmed(insuranceCreator);//refined abstraction(abstract class implementation)
        hospital.getInsurance();
        insuranceCreator = new CheapInsurance();//concrete implementor(interface implementation)
        hospital = new StudClinic(insuranceCreator);
        hospital.getInsurance();

    }

}
