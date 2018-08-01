package car_rental.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import car_rental.models.VehicleCategory;

import car_rental.repository.VehicleCategoryRepository;

@Controller
@RequestMapping(path="/car_rental/vehicle_category")
public class VehicleCategoryController {
    @Autowired
    private VehicleCategoryRepository categoryRepository;
    @GetMapping("/")
    public @ResponseBody Iterable<VehicleCategory>getAllVehicles()
    {
        return categoryRepository.findAll();
    }
}