package car_rental.models.rent;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RentRecord
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private LocalDate rentDate;
    private LocalDate returnDate;
    private double fee;
    private double lateFee;
    private double totalFee;

    private boolean paid;

    public RentRecord(LocalDate rentDate, LocalDate returnDate, double fee)
    {
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.fee = fee;
    }

    public RentRecord()
    {

    }

    public long getId()
    {
        return this.id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public LocalDate getRentDate()
    {
        return this.rentDate;
    }

    public void setRentDate(LocalDate rentDate)
    {
        this.rentDate = rentDate;
    }

    public LocalDate getReturnDate()
    {
        return this.returnDate;
    }

    public void setReturnDate(LocalDate returnDate)
    {
        this.returnDate = returnDate;
    }

    public double getFee()
    {
        return this.fee;
    }

    public void setFee(double fee)
    {
        this.fee = fee;
    }

    public void setLateFee(double lateFee)
    {
        this.lateFee = lateFee;
    }

    public double getLateFee()
    {
        return this.lateFee;
    }

    public double getTotalFee()
    {
        return this.totalFee;
    }

    public void setTotalFee(double totalFee)
    {
        this.totalFee = totalFee;
    }

    public boolean isPaid()
    {
        return this.paid;
    }

    public void setPaid(boolean paid)
    {
        this.paid = paid;
    }


}