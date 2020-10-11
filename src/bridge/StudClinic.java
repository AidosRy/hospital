package bridge;

public class StudClinic extends Hospital {

    public StudClinic(InsuranceCreator insuranceCreator) {
        super(insuranceCreator);
    }
    @Override
    public void getInsurance() {
        creator.createInsurance();
    }
}
