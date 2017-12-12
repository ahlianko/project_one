package model.entity.aircraft;

public class CargoAircraft extends Aircraft {
    public CargoAircraft(String name, int cargo, int fuelConsumption, int flyRange) {
        super(name,0,cargo,fuelConsumption,flyRange);
    }
}
