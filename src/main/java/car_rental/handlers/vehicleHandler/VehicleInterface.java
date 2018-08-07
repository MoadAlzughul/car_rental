package car_rental.handlers.vehicleHandler;

import car_rental.models.vehicle.Vehicle;

import java.util.List;


public interface VehicleInterface {

    List<Vehicle> findAll();
    void deleteById(long id);
    void save(Vehicle vehicle);
    Vehicle findOne(long id);

}