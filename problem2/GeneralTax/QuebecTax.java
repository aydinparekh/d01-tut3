package GeneralTax;

public class QuebecTax extends Tax {
    @Override
    protected double getGstRate() {
        return 0.05;
    }

    @Override
    protected double getPstRate() {
        return 0.09975;
    }

    @Override
    protected double getHstRate() {
        return 0;
    }
}
