package com.example.rjd_spring_test.controller;

import com.example.rjd_spring_test.entity.Tram;
import com.example.rjd_spring_test.service.TramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class MyRESTController {

    @Autowired
    private TramService tramService;


    @GetMapping("/trams")
    public List<Tram> showAllTrams() {
        List<Tram> allTrams = tramService.getAllTrams();
        return tramService.getAllTrams();
    }

    @GetMapping("/trams/{id}")   //получаем id из самого url адреса
    public Tram getTram(@PathVariable int id) {
        Tram tram = tramService.getTram(id);
        return tram;
    }

    @PostMapping("/trams")
    public Tram addNewTram(@RequestBody Tram tram) {
        tramService.saveTram(tram);

        return tram;
    }

    @PutMapping("/trams")
    public Tram updateTram(@RequestBody Tram tram) {
        tramService.saveTram(tram);

        return tram;
    }

    @DeleteMapping("/trams/{id}")
    public String deleteTram(@PathVariable int id) {
        Tram tram = tramService.getTram(id);

        tramService.deleteTram(id);
        return "Tram with ID = " + id + " was deleted";
    }
}
