package com.HotelBookingSystem.example.Hotel.dao;

import com.HotelBookingSystem.example.Hotel.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Integer> {
}
