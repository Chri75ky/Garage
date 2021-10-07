public abstract class Car {
    // Attributes for the abstract class
    private String regNr;
    private String brand;
    private String model;
    private String year;
    private String amountOfDoors;

    // Constructor for the standard car
    public Car(String regNr, String brand, String model, String year, String amountOfDoors) {
        this.regNr = regNr;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.amountOfDoors = amountOfDoors;
    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAmountOfDoors() {
        return amountOfDoors;
    }

    public void setAmountOfDoors(String amountOfDoors) {
        this.amountOfDoors = amountOfDoors;
    }

    public abstract double measureGreenPropertyTax();

    @Override
    public String toString() {
        return "Car{" +
                "regNr='" + regNr + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", amountOfDoors='" + amountOfDoors + '\'' +
                '}';
    }
}
