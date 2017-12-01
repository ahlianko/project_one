package Project_one.model.entity.Aircraft;

public class Aircraft {
    private String name;
    private int passengers;
    private int cargo;
    private int flyRange;
    private int fuelConsumption;

    public Aircraft() {
    }

    public Aircraft(String name, int passengers, int cargo, int flyRange, int fuelConsumption) {
        this.name = name;
        this.passengers = passengers;
        this.cargo = cargo;
        this.flyRange = flyRange;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public int getFlyRange() {
        return flyRange;
    }

    public void setFlyRange(int flyRange) {
        this.flyRange = flyRange;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
