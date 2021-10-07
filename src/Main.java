public class Main {
    public static void main(String[] args) {

        GasCar gasCar = new GasCar("12345678", "BMW", "KenderIkkeEnModel", "2005", "4", 50, 13);
        DieselCar dieselCar = new DieselCar("123456764", "Hyundai", "KenderMåskeEnModel", "2010", "6", false, 16);
        ECar eCar = new ECar("12345", "Tesla", "Model X", "2020", "4", 10, 200, 700);
        Garage garage = new Garage();


        garage.addCarToGarage(dieselCar);
        garage.addCarToGarage(eCar);
        garage.addCarToGarage(gasCar);
        System.out.println(garage.toString());
        System.out.println("Den samlede afgift for bilparken er: " + garage.measureTotalGreenPropertyTax() + " Kr.");


    }
}
