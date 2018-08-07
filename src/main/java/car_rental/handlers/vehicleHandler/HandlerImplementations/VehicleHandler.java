package car_rental.handlers.vehicleHandler.HandlerImplementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import car_rental.handlers.vehicleHandler.VehicleInterface;
import car_rental.models.vehicle.Vehicle;
import car_rental.repository.VehicleRepository;

@Service
public class VehicleHandler implements VehicleInterface {

    @Autowired
     private VehicleRepository vehicleRepository;


    @Override
    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    @Override
    public void deleteById(long id) {

        vehicleRepository.deleteById(id);

    }

    @Override
    public void save(Vehicle vehicle) {

        vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle findOne(long id) {
        return vehicleRepository.getOne(id);
    }
}