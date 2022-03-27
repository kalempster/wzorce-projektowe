public class Car {
    float vehicleLiters;
    int productionDate;
    String model;
    String brand;

    public float getVehicleLiters() {
        return this.vehicleLiters;
    }

    public Car setVehicleLiters(float vehicleLiters) {
        this.vehicleLiters = vehicleLiters;
        return this;
    }

    public int getProductionDate() {
        return this.productionDate;
    }

    public Car setProductionDate(int productionDate) {
        this.productionDate = productionDate;
        return this;

    }

    public String getModel() {
        return this.model;

    }

    public Car setModel(String model) {
        this.model = model;
        return this;

    }

    public String getBrand() {
        return this.brand;

    }

    public Car setBrand(String brand) {
        this.brand = brand;
        return this;

    }

}
