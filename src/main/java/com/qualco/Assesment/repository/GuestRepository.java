package com.qualco.Assesment.repository;

import com.qualco.Assesment.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}
