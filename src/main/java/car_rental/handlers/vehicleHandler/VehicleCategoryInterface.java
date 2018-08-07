package car_rental.handlers.vehicleHandler; 

import java.util.List;

import car_rental.models.vehicle.VehicleCategory;

public interface VehicleCategoryInterface {
    List<VehicleCategory> findAll();

    void deleteById(long id);
    
    void save(VehicleCategory vehicleCategory);
    
    VehicleCategory findOne(long id);

}