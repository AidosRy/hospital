package strategy;

public class Payment {
    private PaymentStrategy strategy;

    public Payment(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public int operate(int num1, int num2) {
        return strategy.operate(num1, num2);
    }
}
