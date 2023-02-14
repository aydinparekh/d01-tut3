/*
 * CSCD01 Winter 2023 Tut 3
 */

package GeneralTax;

public abstract class Tax {

    protected abstract double getPstRate();
    protected abstract double getGstRate();
    protected abstract double getHstRate();
    private double calculatePstTax(double total) {
        return getPstRate() * total;
    }

    private double calculateGstTax(double total) {
        return getGstRate() * total;
    }

    private double calculateHstTax(double total) {
        return getHstRate() * total;
    }

    public double calculateTotalTax(double total) {
        return calculatePstTax(total) +
                calculateGstTax(total) +
                calculateHstTax(total);
    }
}
