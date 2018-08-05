package car_rental.models.user;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import car_rental.models.payment.Payment;
import car_rental.models.rent.RentRecord;

@Entity
public class Customer extends User
{
    private String email;

    @OneToOne
    @JoinColumn(name= "payment_id")
    private Payment payment;
    @OneToMany(mappedBy = "customer")
    private List<RentRecord> rentRecord;

    public Customer(String fullName, Address address, String email, Payment payment)
    {
        super(fullName, address);
        this.email = email;
        this.payment = payment;
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

    public List<RentRecord> getRentRecord()
    {
        return this.rentRecord;
    }

    public void setRentRecord(List<RentRecord> rentRecord)
    {
        this.rentRecord = rentRecord;
    }

    public Payment getPayment()
    {
        return this.payment;
    }

}