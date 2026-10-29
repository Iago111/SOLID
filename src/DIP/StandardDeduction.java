package DIP;

public class StandardDeduction implements DeductionCalculator {
    @Override
    public float calcDeduction(float amount, int percentage) {
        return (amount * percentage) / 100;
    }
}