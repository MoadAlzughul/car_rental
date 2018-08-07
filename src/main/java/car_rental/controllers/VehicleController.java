package car_rental.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import car_rental.handlers.vehicleHandler.HandlerImplementations.VehicleHandler;


@Controller
@RequestMapping(path="/car_rental/vehicles")
public class VehicleController {
    @Autowired
    private VehicleHandler vehicleHandler;

    @GetMapping("/")
    public String vehicleCategories(Model model)
    {
        model.addAttribute("vehicles", vehicleHandler.findAll());
        return "vehicles";
    }

}