package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;


@Controller
public class CarController {

    private final CarServiceImp carServiceImp = new CarServiceImp();


    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5") int count, ModelMap modelMap) {
        modelMap.addAttribute("carList", carServiceImp.giveListOfCars(count));
        return "cars";
    }
}
