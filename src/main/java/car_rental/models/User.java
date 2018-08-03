package car_rental.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long userId;
    protected String fullName;
    
    public User(String fullName)
    {
        this.fullName = fullName;
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
}
