/*
 * CSCD01 Winter 2023 Tut 3
 */

package GeneralTax;

public abstract class Tax {

    protected abstract double getTaxRate();

    public abstract double calculateTotalTax(double total);

}
