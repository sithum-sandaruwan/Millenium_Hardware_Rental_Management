package org.millenium.rental.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.millenium.rental.dto.Rental;
import org.millenium.rental.entity.CustomerEntity;
import org.millenium.rental.entity.RentalEntity;
import org.millenium.rental.repository.RentalRepo;
import org.millenium.rental.service.RentalService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {

    final RentalRepo rentalRepo;
    @Override
    public void addRental(Rental rental) {
        RentalEntity rentalEntity = new ObjectMapper().convertValue(rental, RentalEntity.class);
        rentalRepo.save(rentalEntity);
    }

    @Override
    public List<Rental> getAllRentals() {
        ArrayList<Rental> rentalList = new ArrayList<>();

        List<RentalEntity> all = rentalRepo.findAll();

        all.forEach(rentalEntity -> {
            rentalList.add(new ObjectMapper().convertValue(rentalEntity,Rental.class));
        });
        return rentalList;
    }

    @Override
    public void deleteRentalById(Long rent_id) {
        if (rentalRepo.existsById(rent_id)){
            rentalRepo.deleteById(rent_id);
        }
    }

    @Override
    public void updateRental(Rental rental) {

        if (rentalRepo.findById(rental.getrent_id()).isPresent(){
            rentalRepo.save(new ObjectMapper().convertValue(rental,RentalEntity.class));
        }
    }
}
