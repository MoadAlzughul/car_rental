package car_rental.models.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long userId;
    protected String fullName;
    
    @OneToOne
    @JoinColumn(name = "address_id")
    protected Address address;

    public User(String fullName, Address address)
    {
        this.fullName = fullName;
        this.address = address;
    }

    public User()
    {

    }

    public long getUserId()
    {
        return userId;
    }

    public void setUserId(long userId)
    {
        this.userId = userId;
    }

    public String getFullName()
    {
        return this.fullName;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public Address getAddress()
    {
        return this.address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }
}
