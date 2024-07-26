package org.millenium.rental.repository;

import org.millenium.rental.entity.RentalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepo extends JpaRepository<RentalEntity,Long> {

}
