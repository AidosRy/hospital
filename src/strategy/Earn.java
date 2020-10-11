package strategy;

public class Earn implements PaymentStrategy {
    @Override
    public int operate(int num1, int num2) {
        return num1+num2;
    }
}
