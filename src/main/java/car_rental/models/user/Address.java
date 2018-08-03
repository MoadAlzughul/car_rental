package car_rental.models.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address
{
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String city;
    private String state;
    private int zipCode;
    private String street;


    public Address(String street, String city, String state, int zipCode)
    {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Address()
    {

    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return this.id;
    }

    public String getStreet()
    {
        return this.street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getCity()
    {
        return this.city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return this.state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public int getZipCode()
    {
        return this.zipCode;
    }

    public void setZipCode(int zipCode)
    {
        this.zipCode = zipCode;
    }
}