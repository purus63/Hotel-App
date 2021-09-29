package com.hackerearth.altir.hotel.entity;

import java.sql.Date;

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
@Table(name="booking_date_table")
public class DatesEntity {
	
	@Id
	@GeneratedValue
	private long date_id;
	
	private Date start_date;
	private Date end_date;
	
	private long booking_id;
	
	
}
