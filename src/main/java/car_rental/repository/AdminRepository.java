package car_rental.repository;

import org.springframework.data.repository.CrudRepository;

import car_rental.models.user.Admin;

public interface AdminRepository extends CrudRepository<Admin, Long>
{
    
}