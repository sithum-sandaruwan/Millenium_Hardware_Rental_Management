package org.millenium.rental.repository;

import org.millenium.rental.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<CustomerEntity,Long> {
}
