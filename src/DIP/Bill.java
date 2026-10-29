package DIP;

import java.sql.Date;

public class Bill {
    public String code;
    public Date billDate;
    public float billAmount;
    public float VATAmount;
    public float billDeduction;
    public float billTotal;
    public int deductionPercentage;

    private DeductionCalculator deductionCalculator;
    private VATCalculator vatCalculator;

    public Bill(DeductionCalculator dCalc, VATCalculator vCalc) {
        this.deductionCalculator = dCalc;
        this.vatCalculator = vCalc;
    }

    public void totalCalc() {
        billDeduction = deductionCalculator.calcDeduction(billAmount, deductionPercentage);
        VATAmount = vatCalculator.calcVAT(billAmount);
        billTotal = (billAmount - billDeduction) + VATAmount;
    }
}