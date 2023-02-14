package GeneralTax;

public class OntarioTax extends Tax{
    @Override
    protected double getTaxRate() {
        return 0.13;
    }
}
