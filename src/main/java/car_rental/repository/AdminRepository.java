package car_rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import car_rental.models.user.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>
{
    
}