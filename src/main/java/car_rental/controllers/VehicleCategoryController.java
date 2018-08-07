package car_rental.controllers;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import car_rental.handlers.vehicleHandler.HandlerImplementations.VehicleCategoryHandler;
import car_rental.models.vehicle.VehicleCategory;


@Controller
@RequestMapping(path="/car_rental/vehicle_category")
public class VehicleCategoryController {
    @Autowired
    private VehicleCategoryHandler categoryHandler;

    @GetMapping("/categories")
    public String vehicleCategories(Model model)
    {
        model.addAttribute("categories", categoryHandler.findAll());
        return "categories";
    }

    @RequestMapping("/add_category")
    public String addVehicleCategory(Model model){
        model.addAttribute("vehicle_cat",new VehicleCategory());
        return "admin/addVehicleCategory";
    }

    @RequestMapping(value = "/editcategory/{id}",method = RequestMethod.GET )
    public String editVehicleCategory(@PathVariable long id,Model model){

        model.addAttribute("vehicle_cat",categoryHandler.findOne(id));


        return "admin/editVehicleCategory";


    }

    @RequestMapping(value = "/editcategory",method = RequestMethod.POST)
    public String updateVehicleCategory(@ModelAttribute("vehicle_cat")VehicleCategory vehicleCategory){

        categoryHandler.save(vehicleCategory);
        return "redirect:/listcategory";


    }

    @RequestMapping(value = "/deletecategory/{id}",method = RequestMethod.GET )
    public String deleteVehicleCategory(@PathVariable long id){
        VehicleCategory cat=categoryHandler.findOne(id);
        if(cat.getVehicleList().size()>0){

            return "redirect:/listcategory";


        }

        categoryHandler.deleteById(id);


        return "redirect:/listcategory";


    }


}