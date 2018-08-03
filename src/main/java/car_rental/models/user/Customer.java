package car_rental.models.user;

import javax.persistence.Entity;

@Entity
public class Customer extends User
{
    private String email;

    public Customer(String fullName, Address address, String email)
    {
        super(fullName, address);
        this.email = email;
    }

    public Customer(String fullName, String email)
    {
        super(fullName, null);
        this.email = email;
    }

    public Customer()
    {

    }

    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }


}