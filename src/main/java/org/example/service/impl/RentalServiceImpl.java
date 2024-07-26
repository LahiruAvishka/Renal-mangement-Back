package org.example.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.example.dto.Rental;
import org.example.entity.RentalEntity;
import org.example.repository.RentalRepository;
import org.example.service.RentalService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {

    final RentalRepository repository;

    @Override
    public void addRental(Rental rental) {

        RentalEntity rentalEntity=new ObjectMapper().convertValue(rental,RentalEntity.class);
        repository.save(rentalEntity);
    }



}
