package com.example.StudentProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.IconUIResource;
import java.util.List;

@RestController
@RequestMapping("/S")
public class ControllerClass {
    @Autowired
    private ServiceClass serviceClass;
    @GetMapping("/sdetail")
    public List Sinfo(){
        return serviceClass.Sinfo();
    }

    @GetMapping("/sdetail/{SId}")
    public User getInfo(@PathVariable long SId){
        return this.serviceClass.getInfo(SId);
    }

    @PostMapping("/addS")
    public User addSInfo(@RequestBody User user){
        return this.serviceClass.addSInfo(user);
    }

    @PutMapping("/updateS/{SId}")
    public List<User>updateS(@PathVariable long SId){
        return this.serviceClass.updateS(SId);
    }

    @DeleteMapping("/deletS/{SId}")
    public List<User>dSInfo(@PathVariable long SId){
        return this.serviceClass.dSInfo(SId);
    }
}
