package com.kirankhanal.HotelAPI.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;


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
    @Column(name="rating")
    private Float rating;
    @Column(name="image")
    private String image;
}
