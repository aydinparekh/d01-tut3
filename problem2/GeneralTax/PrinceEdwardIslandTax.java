package GeneralTax;

public class PrinceEdwardIslandTax extends Tax {
    @Override
    protected double getGstRate() {
        return 0;
    }

    @Override
    protected double getPstRate() {
        return 0;
    }

    @Override
    protected double getHstRate() {
        return 0.15;
    }
}
