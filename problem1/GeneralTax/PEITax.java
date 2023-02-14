package GeneralTax;

public class PEITax extends Tax{
    @Override
    protected double getTaxRate() {
        return 0.15;
    }

    @Override
    public double calculateTotalTax(double total) {
        return total * this.getTaxRate();
    }
}
