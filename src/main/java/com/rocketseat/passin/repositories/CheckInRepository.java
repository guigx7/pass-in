package com.rocketseat.passin.repositories;

import com.rocketseat.passin.domain.checkIn.CheckIn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckInRepository extends JpaRepository<CheckIn, Integer> {
}
