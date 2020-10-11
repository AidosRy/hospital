package bridge;

public class ExpensiveInsurance implements InsuranceCreator {
    @Override
    public void createInsurance() {
        System.out.println("expensive insurance created");
    }
}
