/*
 * CSCD01 Winter 2023 Tut 3
 */

package GeneralTax;

public abstract class Tax {

    protected abstract double getTaxRate();

    public double calculateTotalTax(double total){
        return total * (this.getTaxRate());
    }

}
