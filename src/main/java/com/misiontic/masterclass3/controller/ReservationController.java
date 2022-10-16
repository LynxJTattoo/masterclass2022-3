package com.misiontic.masterclass3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.misiontic.masterclass3.entities.Reservation;
import com.misiontic.masterclass3.services.ReservationService;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {
    
    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> getAll(){
        return reservationService.getAll();
    }

    @PostMapping("/save")
    public Reservation save(@RequestBody Reservation p){
        return reservationService.save(p);
    }
}
