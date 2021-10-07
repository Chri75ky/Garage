public class GasCar extends Car {
    private int oktanNumbers;
    private double kmPrL;

    public GasCar(String regNr, String brand, String model, String year, String amountOfDoors, int oktanNumbers, int kmPrL) {
        super(regNr, brand, model, year, amountOfDoors);
        this.oktanNumbers = oktanNumbers;
        this.kmPrL = kmPrL;

    }

    public int getOktanNumbers() {
        return oktanNumbers;
    }

    public void setOktanNumbers(int oktanNumbers) {
        this.oktanNumbers = oktanNumbers;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    public double measureGreenPropertyTax() {
        double sum = 0;
        if (kmPrL < 5) {
            sum = 10470;
        } else if (kmPrL > 5 && kmPrL <= 10) {
            sum = 5500;
        } else if (kmPrL > 10 && kmPrL <= 15) {
            sum = 2340;
        } else if (kmPrL > 15 && kmPrL < 20) {
            sum = 1050;
        } else if (kmPrL > 20 && kmPrL < 50) {
            sum = 330;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "\nGas" + super.toString() + " " +
                "oktanNumbers=" + oktanNumbers +
                ", kmPrL=" + kmPrL +
                '}';
    }
}
