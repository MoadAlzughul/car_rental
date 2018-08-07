package car_rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import car_rental.models.vehicle.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>
{
    
}