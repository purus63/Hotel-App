package com.hackerearth.altir.hotel.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="booking_table")
public class BookingEntity {
	
	@Id
	@GeneratedValue
	private long booking_id;
	
	private long user_id;
	
	//private List<OrderEntity> orders;
	
	
}
