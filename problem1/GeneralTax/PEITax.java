package GeneralTax;

public class PEITax extends Tax{
    @Override
    protected double getTaxRate() {
        return 0.15;
    }
}
