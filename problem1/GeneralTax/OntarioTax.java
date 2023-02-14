package GeneralTax;

public class OntarioTax extends Tax{
    @Override
    protected double getTaxRate() {
        return 0.13;
    }

    @Override
    public double calculateTotalTax(double total) {
        return total * this.getTaxRate();
    }
}
