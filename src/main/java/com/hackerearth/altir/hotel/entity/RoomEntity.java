package com.hackerearth.altir.hotel.entity;


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
@Table(name="room_table")
public class RoomEntity {
	
	@Id
	@GeneratedValue
	private long room_id;
	
	private String room_type;

	private String room_size;
	
	private double room_price;
	
	private boolean status;
	
}
