package bridge;

public class Asmed extends Hospital {
    public Asmed(InsuranceCreator creator){
        super(creator);
    }

    @Override
    public void getInsurance() {
        creator.createInsurance();
    }
}
