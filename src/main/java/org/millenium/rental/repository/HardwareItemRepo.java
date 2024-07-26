package org.millenium.rental.repository;

import org.millenium.rental.entity.HardwareItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HardwareItemRepo extends JpaRepository<HardwareItemEntity,Long> {
}
