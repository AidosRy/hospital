package factory;

public class Patient implements Human {
    private int money;
    @Override
    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public int getMoney() {
        return money;
    }
}
