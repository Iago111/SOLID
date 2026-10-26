package SRP;

public class BillDeduction {
	public float calcDeduction(float billAmount, int deductionPercentage) {
		return (billAmount * deductionPercentage) / 100;
	}
}
