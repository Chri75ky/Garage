public class DieselCar extends Car {
    private boolean hasParticleFilter;
    private double kmPrL;

    public DieselCar(String regNr, String brand, String model, String year, String amountOfDoors, boolean hasParticleFilter, double kmPrL) {
        super(regNr, brand, model, year, amountOfDoors);
        this.hasParticleFilter = hasParticleFilter;
        this.kmPrL = kmPrL;
    }

    public boolean isHasParticleFilter() {
        return hasParticleFilter;
    }

    public void setHasParticleFilter(boolean hasParticleFilter) {
        this.hasParticleFilter = hasParticleFilter;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    public double measureGreenOwnerCharge() {
        double sum = 0;
        if (kmPrL < 5) {
            sum = 10470 + measureUdligningsAfgift() + measureParticleCharge();
        } else if (kmPrL > 5 && kmPrL <= 10) {
            sum = 5500 + measureUdligningsAfgift() + measureParticleCharge();
        } else if (kmPrL > 10 && kmPrL <= 15) {
            sum = 2340 + measureUdligningsAfgift() + measureParticleCharge();
        } else if (kmPrL > 15 && kmPrL < 20) {
            sum = 1050 + measureUdligningsAfgift() + measureParticleCharge();
        } else if (kmPrL > 20 && kmPrL < 50) {
            sum = 330 + measureUdligningsAfgift() + measureParticleCharge();
        }
        return sum;
    }

    public double measureUdligningsAfgift() {
        double sumOfUdligning = 0;
        if (kmPrL < 5) {
            sumOfUdligning = 15260;
        } else if (kmPrL > 5 && kmPrL <= 10) {
            sumOfUdligning = 2770;
        } else if (kmPrL > 10 && kmPrL <= 15) {
            sumOfUdligning = 1850;
        } else if (kmPrL > 15 && kmPrL < 20) {
            sumOfUdligning = 1390;
        } else if (kmPrL > 20 && kmPrL < 50) {
            sumOfUdligning = 130;
        }
        return sumOfUdligning;
    }

    public int measureParticleCharge() {
        if (hasParticleFilter) {
            return 0;
        } else {
            return 1000;
        }
    }

    @Override
    public String toString() {
        return "\nDiesel" + super.toString() + " " +
                "hasParticleFilter=" + hasParticleFilter +
                ", kmPrL=" + kmPrL +
                '}';
    }
}
