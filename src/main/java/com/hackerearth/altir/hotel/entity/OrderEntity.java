package com.hackerearth.altir.hotel.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
@Table(name="order_table")
public class OrderEntity {
	
	@Id
	@GeneratedValue
	private long order_id;
	
	private long room_id;
	
	//@OneToOne
	//private DatesEntity date_entity;
	

}
