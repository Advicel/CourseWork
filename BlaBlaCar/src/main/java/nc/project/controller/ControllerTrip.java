package nc.project.controller;

import nc.project.Driver.Driver;
import nc.project.Trip.Trip;
import nc.project.Trip.TripMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class ControllerTrip {
    @Autowired
    TripMongoRepository tripMongoRepository;
    @GetMapping("/TripList")
    public String TripList(){
        return "/TripList";
    }
    @PostMapping("/AddTrip")
    public String postEmployee(@RequestParam("startPoint") String startPoint, @RequestParam("endPoint") String endPoint, @RequestParam("driver") Driver driver, @RequestParam("date") Date date) {
        tripMongoRepository.save(new Trip(startPoint,endPoint,driver, date));
        return "redirect:/DriverList";
    }
}
