package DIP;

public class StandardVAT implements VATCalculator {
    @Override
    public float calcVAT(float amount) {
        return (float) (amount * 0.16);
    }
}
