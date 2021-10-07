import java.util.ArrayList;

public class Garage {
    private ArrayList<Car> garage = new ArrayList<>();

    public void addCarToGarage(Car car) {
        garage.add(car);
    }

    public double measureTotalGreenPropertyTax() {
        double totalGreenCharge = 0;
        for (Car car : garage) {
            if (car instanceof GasCar) {
                totalGreenCharge += ((GasCar) car).measureGreenPropertyTax();
            } else if (car instanceof ECar) {
                totalGreenCharge += ((ECar) car).measureGreenPropertyTax();
            } else {
                totalGreenCharge += ((DieselCar) car).measureGreenPropertyTax();
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
