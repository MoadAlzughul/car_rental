package car_rental.models.user;

import javax.persistence.Entity;

@Entity
public class Admin extends User
{
    public Admin(String fullName, Address address)
    {
        super(fullName, address);
    }

    public Admin()
    {

    }

    
}