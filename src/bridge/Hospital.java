package bridge;

//abstraction
public abstract class Hospital {

    public InsuranceCreator creator;

    public Hospital(InsuranceCreator creator) {
        this.creator = creator;
    }

    abstract public void getInsurance();
}
