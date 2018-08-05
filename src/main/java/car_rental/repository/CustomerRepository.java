package car_rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import car_rental.models.user.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>
{
    
}