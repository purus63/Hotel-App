package com.hackerearth.altir.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackerearth.altir.hotel.entity.OrderEntity;


@Repository
public interface OrderRepository extends JpaRepository<OrderEntity,Long>{

}