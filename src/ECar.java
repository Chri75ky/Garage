public class ECar extends Car {
    private int batteryCapacityKWh;
    private int maxKm;
    private int whPrKm;

    public ECar(String regNr, String brand, String model, String year, String amountOfDoors, int batteryCapacityKWh, int maxKm, int whPrKm) {
        super(regNr, brand, model, year, amountOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public void setBatteryCapacityKWh(int batteryCapacityKWh) {
        this.batteryCapacityKWh = batteryCapacityKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    public double measureGreenPropertyTax() {
        double whPrKmDivided = whPrKm / 91.25;
        double whPrKmToKmPrL = 100 / whPrKmDivided;
        double sum = 0;
        if (whPrKmToKmPrL < 5) {
            sum = 10470;
        } else if (whPrKmToKmPrL > 5 && whPrKmToKmPrL <= 10) {
            sum = 5500;
        } else if (whPrKmToKmPrL > 10 && whPrKmToKmPrL <= 15) {
            sum = 2340;
        } else if (whPrKmToKmPrL > 15 && whPrKmToKmPrL < 20) {
            sum = 1050;
        } else if (whPrKmToKmPrL > 20 && whPrKmToKmPrL < 50) {
            sum = 330;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "\nE" + super.toString() + " " +
                "batteryCapacityKWh=" + batteryCapacityKWh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                '}';
    }
}
