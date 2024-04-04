package com.rocketseat.passin.repositories;

import com.rocketseat.passin.domain.checkIn.CheckIn;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface CheckInRepository extends JpaRepository<CheckIn, Integer> {
    Optional<CheckIn> findByAttendeeId(String attendeeId);
}