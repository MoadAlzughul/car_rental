package car_rental.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class VehicleCategory
{
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Vehicle> vehicleList;

    public VehicleCategory(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public VehicleCategory()
    {

    }

    public void setId(long id)
    {
        this.id = id;
    }
    public long getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
    public String getDescription()
    {
        return this.description;
    }

    public List<Vehicle> getVehicleList()
    {
        return this.vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList)
    {
        this.vehicleList = vehicleList;
    }

    public void addVehicle(Vehicle vehicle)
    {
        this.vehicleList.add(vehicle);
    }

}