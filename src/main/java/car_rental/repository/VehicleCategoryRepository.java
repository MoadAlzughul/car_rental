package car_rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import car_rental.models.vehicle.VehicleCategory;

public interface VehicleCategoryRepository extends JpaRepository<VehicleCategory, Long>
{
    
}