package org.example.controller;


import lombok.RequiredArgsConstructor;
import org.example.dto.Rental;
import org.example.service.RentalService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rental-management")
@CrossOrigin
@RequiredArgsConstructor

    public class RentalController {

    final RentalService service;
    @PostMapping("add-rental")
    @ResponseStatus(HttpStatus.CREATED)
    public void addRental(@RequestBody Rental rental) {
        service.addRental(rental);
    }


}