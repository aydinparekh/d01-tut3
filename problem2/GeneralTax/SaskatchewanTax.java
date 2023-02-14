package GeneralTax;

public class SaskatchewanTax extends Tax {
    @Override
    protected double getGstRate() {
        return 0.05;
    }

    @Override
    protected double getPstRate() {
        return 0.06;
    }

    @Override
    protected double getHstRate() {
        return 0;
    }
}
