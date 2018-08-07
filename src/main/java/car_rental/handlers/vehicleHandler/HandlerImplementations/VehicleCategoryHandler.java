package car_rental.handlers.vehicleHandler.HandlerImplementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import car_rental.models.vehicle.VehicleCategory;
import car_rental.repository.VehicleCategoryRepository;

import car_rental.handlers.vehicleHandler.*;

@Service
public class VehicleCategoryHandler implements VehicleCategoryInterface {
@Autowired
private VehicleCategoryRepository vehicleCategoryRepository;
    @Override
    public List<VehicleCategory> findAll() {
        return vehicleCategoryRepository.findAll();
    }

    @Override
    public void deleteById(long id) {
       vehicleCategoryRepository.deleteById(id);
    }

    @Override
    public void save(VehicleCategory vehicleCategory) {
        vehicleCategoryRepository.save(vehicleCategory);
    }

    @Override
    public VehicleCategory findOne(long id) {
        return vehicleCategoryRepository.getOne(id);
    }
}