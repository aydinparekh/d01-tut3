package GeneralTax;

public class NunavutTax extends Tax {
    @Override
    protected double getGstRate() {
        return 0.05;
    }

    @Override
    protected double getPstRate() {
        return 0;
    }

    @Override
    protected double getHstRate() {
        return 0;
    }
}
