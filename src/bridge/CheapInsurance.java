package bridge;

public class CheapInsurance implements InsuranceCreator{
    @Override
    public void createInsurance() {
        System.out.println("cheap insurance created");
    }
}
