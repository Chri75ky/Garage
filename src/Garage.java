import java.util.ArrayList;

public class Garage {
    private ArrayList<Car> garage = new ArrayList<>();

    public Garage() {

    }

    public void addCarToGarage(Car car) {
        garage.add(car);
    }

    public double measureTotalGreenOwnerCharge() {
        double totalGreenCharge = 0;
        for (Car car : garage) {
            if (car instanceof GasCar) {
                totalGreenCharge += ((GasCar) car).measureGreenOwnerCharge();
            } else if (car instanceof ECar) {
                totalGreenCharge += ((ECar) car).measureGreenOwnerCharge();
            } else {
                totalGreenCharge += ((DieselCar) car).measureGreenOwnerCharge();
            }
        }
        return totalGreenCharge;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "garage=" + garage +
                '}' + "\n";
    }
}
