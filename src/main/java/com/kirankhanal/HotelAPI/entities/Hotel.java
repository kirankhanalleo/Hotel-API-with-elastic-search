package com.kirankhanal.HotelAPI.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@Data
@NoArgsConstructor
@Entity
@Table(name="hotel")
public class Hotel implements Serializable {
    //Basic Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="hotel_id")
    private Long hotelID;
    @Column(name="hotel_name")
    private String hotelName;
    @Column(name="location")
    private String location;
    @Column(name="contact")
    private String contact;
    @Column(name="number_of_rooms")
    private Integer numberOfRooms;
    @Column(name="rates")
    private BigDecimal rates;
}
