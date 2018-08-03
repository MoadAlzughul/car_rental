package car_rental.repository;

import org.springframework.data.repository.CrudRepository;

import car_rental.models.user.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>
{
    
}