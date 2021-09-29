package com.hackerearth.altir.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hackerearth.altir.hotel.entity.BookingEntity;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity,Long>{

}
