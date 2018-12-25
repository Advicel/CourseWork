package nc.project.controller;

import nc.project.Driver.Driver;
import nc.project.Driver.DriverMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerDriver {
    private DriverMongoRepository driverMongoRepository;

    @Autowired
    public void setDriverMongoRepository(DriverMongoRepository driverMongoRepository) {
        this.driverMongoRepository = driverMongoRepository;
    }

    @PostMapping("/AddDriver")
    public String postEmployee(@RequestParam("name") String name,@RequestParam("age") int age,@RequestParam("car") String car) {
        driverMongoRepository.save(new Driver(name,age,car));
        return "redirect:/DriverList";
    }
    @GetMapping("/DriverList")
    public String vievDriverList(Model model){
        model.addAttribute("drivers",driverMongoRepository.findAll());
        return "DriverList";
    }
    @GetMapping("/AddDriver")
    public String addDriver(Model model){
        return "AddDriver";
    }

    @PostMapping("/DriverList/delete")
    public void deleteDriver(@RequestParam("delete") String name){
        driverMongoRepository.deleteById(name);
    }
//    @GetMapping("/login")
//    public String login(){
//        return "/Login";
//    }
    @GetMapping("/registry")
    public String signin(){
        return "/Registry";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }
    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }

}
